package org.archcorner.morphia;

import static dev.morphia.aggregation.Group.grouping;
import static dev.morphia.aggregation.Group.push;


import java.util.Iterator;
import java.util.List;

import org.bson.types.ObjectId;


import org.archcorner.morphia.domain.Writer;
import org.archcorner.morphia.domain.Product;
import org.archcorner.morphia.domain.Company;
import com.mongodb.MongoClient;

import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.query.Query;
import dev.morphia.query.UpdateOperations;


public class MorphiaExample {

    private static Datastore datastore;
    private static ObjectId id = new ObjectId();

    public static void main(String[] args)
	{
        Morphia morphia = new Morphia();
        morphia.mapPackage("org.archcorner.morphia");
        datastore = morphia.createDatastore(new MongoClient(), "productshop");
        datastore.ensureIndexes();

        Company company = new Company(id, "Apress");
        Product product = new Product("23186", "Learning Java 8", "Tom Smith", 4.65, company);
        Product companionProduct = new Product("2975103", "Rust Companion", "Mike Douglas", 2.45, company);
        product.addCompanionProducts(companionProduct);
        datastore.save(companionProduct);
        datastore.save(product);

        List<Product> products = datastore.createQuery(Product.class)
            .field("title")
            .contains("Learning Java 8")
            .find()
            .toList();
        System.out.println(products.size());
        System.out.println(products.get(0));

        company = new Company(id, "Oreilly");
        product = new Product("231787", "Learning Java 9", "George Smith", 9.98, company);
        datastore.save(product);
        Query<Product> query = datastore.createQuery(Product.class)
            .field("title")
            .contains("Learning Java 9");
        UpdateOperations<Product> updates = datastore.createUpdateOperations(Product.class)
            .inc("price", 1);
        datastore.update(query, updates);
        products = datastore.createQuery(Product.class)
            .field("title")
            .contains("Learning Java 9")
            .find()
            .toList();
        System.out.println( products.get(0).getCost());

        company = new Company(id, "Manning");
        product = new Product("24176", "Learning Go", "John Smith", 6.43, company);
        datastore.save(product);
        query = datastore.createQuery(Product.class)
            .field("title")
            .contains("Learning Go");
        datastore.delete(query);
       products = datastore.createQuery(Product.class)
            .field("title")
            .contains("Learning Go")
            .find()
            .toList();
        System.out.println( products.size());

        company = new Company(id, "Hatcher");
        datastore.save(new Product("9781565927186", "Learning Dart", "Tom Smith", 3.21, company));
        datastore.save(new Product("9781449313142", "Learning Adobe", "Mark Smith", 6.32, company));
        datastore.save(new Product("9787564100476", "Learning Python 3", "Sandy Beger", 9.81, company));
        datastore.save(new Product("9781449368814", "Learning Scala 6", "Mark Sawyer", 8.72, company));
        datastore.save(new Product("9781784392338", "Learning Go 3", "John Sawyer", 6.43, company));

        Iterator<Writer> authors = datastore.createAggregation(Product.class)
            .group("author", grouping("products", push("title")))
            .out(Writer.class);

        System.out.println(authors.hasNext());


        company = new Company(id, "Macmillan");
        product = new Product("654321", "Learning C++", "Kerngie Richhie", 4.53, company);
        datastore.save(product);
        products = datastore.createQuery(Product.class)
            .field("title")
            .contains("Learning C++")
            .project("title", true)
            .find()
            .toList();
        System.out.println(products.size());
        System.out.println( products.get(0)
            .getTitle());
        System.out.println(products.get(0)
            .getWriter());
    }
	
}