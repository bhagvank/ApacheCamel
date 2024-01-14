package org.archcorner.morphia.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import dev.morphia.annotations.Embedded;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Field;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Index;
import dev.morphia.annotations.IndexOptions;
import dev.morphia.annotations.Indexes;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;
import dev.morphia.annotations.Validation;

@Entity("Products")
@Indexes({ @Index(fields = @Field("title"), options = @IndexOptions(name = "product_title")) })
@Validation("{ price : { $gt : 0 } }")
public class Product {
    @Id
    private String isbn;
    @Property
    private String title;
    private String writer;
    @Embedded
    private Company company;
    @Property("price")
    private double cost;
    @Reference
    private Set<Product> companionProducts;
    @Property
    private LocalDateTime publishDate;

    public Product() {

    }

    public Product(String isbn, String title, String writer, double cost, Company company) {
        this.isbn = isbn;
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.company = company;
        this.companionProducts = new HashSet<>();
    }

    // Getters and setters ...
    public String getIsbn() {
        return isbn;
    }

    public Product setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Product setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getWriter() {
        return writer;
    }

    public Product setWriter(String writer) {
        this.writer = writer;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Product setCompany(Company company) {
        this.company = company;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public Product setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public Product setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    public Set<Product> getCompanionProducts() {
        return companionProducts;
    }

    public Product addCompanionProducts(Product product) {
        if (companionProducts != null)
            this.companionProducts.add(product);
        return this;
    }

    @Override
    public String toString() {
        return "Product [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", company=" + company + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((writer == null) ? 0 : writer.hashCode());
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (writer == null) {
            if (other.writer != null)
                return false;
        } else if (!writer.equals(other.writer))
            return false;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (company == null) {
            if (other.company != null)
                return false;
        } else if (!company.equals(other.company))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

}
