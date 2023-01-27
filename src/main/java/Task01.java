import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Task01 {
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{Punct}|\\p{Space}", " ");
    }

    public static void main(String[] args){

        //Variables declaration & initialisation
        String source=null;
        String str = args[0];
        System.out.println(str);
        String line;
        String updatedString;
        int count = 0, maxCount = 0;    
        ArrayList<String> words = new ArrayList<String>();    
        
        // Coding begins
        Path path = Paths.get(str);
        File file = path.toFile();
        
        try {
            // Open the given file
            
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

       //Stripping off punctuations & ignoring case of words
            while(null!=(line=br.readLine())){
              // line.toUpperCase();
              // updatedString  = removePunctuations(line);
               //System.out.println(updatedString);
              // updatedString.toLowerCase();    
               String string[] = line.toLowerCase().split("([,.:!-{}'\\s]+) ");   
               for (int i=0;i<string.length;i++){
               System.out.println(string[i]) ;}
                //Adding all words generated in previous step into words    
                for(String s : string){    
                words.add(s); 
                }    
                for(int i = 0; i < words.size(); i++){    
                count = 1;    
                //Count each word in the file and store it in variable count    
                for(int j = i+1; j < words.size(); j++){    
                    if(words.get(i).equals(words.get(j))){    
                        count++;    
                    }     
                }    
                    }
            
                //closing the readers  
                        br.close();
                        fr.close();

            }
        }catch(IOException e){
                System.out.println("Something went wrong");
                    }
           
    

    }
    
}
