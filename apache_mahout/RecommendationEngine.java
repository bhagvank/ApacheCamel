import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;

import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;

import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
public class RecommendationEngine {
   public static void main(String args[]){
      try{

         DataModel usermodel = new FileDataModel(new File("userdata.txt")); 

         System.out.println(usermodel);     
RecommenderBuilder recommenderBuilder = new RecommenderBuilder() {
			public Recommender buildRecommender(DataModel model) throws TasteException {
				UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

				UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
				return new GenericUserBasedRecommender(model, neighborhood, similarity);
			}
		}; 
         //UserSimilarity usersimilarity = new PearsonCorrelationSimilarity(usermodel);
      
       // 
       //  UserNeighborhood userneighborhood = new ThresholdUserNeighborhood(2.0, usersimilarity, usermodel);
      
        
        // UserBasedRecommender recommender = new GenericUserBasedRecommender(usermodel, userneighborhood, usersimilarity);
        
         //List<RecommendedItem> recommendations = recommender.recommend(3,1);

        Recommender recommender = recommenderBuilder.buildRecommender(usermodel);
		List<RecommendedItem> recommendations = recommender.recommend(3, 1);	
         System.out.println("Recommendations "+recommendations);		
         for (RecommendedItem recommendationItem : recommendations) {
            System.out.println(recommendationItem);
         }
      
      }catch(Exception exception){

            exception.printStackTrace();

       }

     }
     
} 
