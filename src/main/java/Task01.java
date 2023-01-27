import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task01 {
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{Punct}|\\p{Space}", " ");
    }

    public static void main(String[] args){
        String source=null;
        String str = args[0];
        System.out.println(str);
        String line;
        Path path = Paths.get(str);
        File file = path.toFile();
       

        try {
            // Open the given file
            
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
       
            while(null!=(line=br.readLine())){
               line.toUpperCase();
               String updatedString  = removePunctuations(line);
               System.out.println(updatedString);
                
                }
            
        br.close();
        fr.close();
        

            }catch(IOException e){
                System.out.println("Something went wrong");
            }
           
    

    }
    
}
