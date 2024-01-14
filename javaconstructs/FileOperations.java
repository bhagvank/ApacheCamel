
import java.io.File;  
import java.io.FileWriter;   
import java.io.FileNotFoundException; 
import java.io.IOException;   
import java.util.Scanner;   
   
class FileOperations {  
    public static void main(String[] args) {  
        try {  
              
            File file = new File("input.txt");    
            Scanner dataReader = new Scanner(file);  
             
			FileWriter fwrite = new FileWriter("output.txt"); 
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
			    fwrite.write(fileData+System.lineSeparator());    
			}		 
            dataReader.close();  
			fwrite.close(); 
			System.out.println("output file is written"); 
			
		    File fileD = new File("checkDelete.txt");   
		       if (fileD.delete()) {   
		         System.out.println(fileD.getName()+ " file is deleted ");  
		       } else {  
		         System.out.println("Unexpected exception");  
		       } 
			
        } 
		catch (FileNotFoundException exception) {  
            System.out.println(" exception occurred - file is not found");  
            exception.printStackTrace();  
        } 
		catch (IOException exception) {  
		        System.out.println("unable to write to a file");  
		        exception.printStackTrace();  
		        }  
		
		
		
		
    }  
}