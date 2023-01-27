import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task01 {
    public static void main(String[] args){
        String str = args[0];
        System.out.println(str);
        String line=null;
        Path path = Paths.get("./cat_in_the_hat.txt");
        File file = path.toFile();
       

        try {
            // Open a file
            
            FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
            
            while(null!=(line=br.readLine())){
                System.out.println(line);
            }
            

        //    // InputStream is = new FileInputStream(cith);
        //     //OutputStream os = new FileOutputStream("copy_of_cat_in_the_hat.txt");
        //     byte[] buffer = new byte[2048]; // 1/2K buffer

        //     int size;
        //     // size >= 0 when not EOF, size == -1 at EOF
        //     while ((size = is.read(buffer)) >= 0) {
        //         System.out.printf("read: %d\n", size);
        //         os.write(buffer, 0, size);
        br.close();
            fr.close();

            }catch(IOException e){
                System.out.println("Something went wrong");
            }
            
            // Close the input stream
    

    }
    
}
