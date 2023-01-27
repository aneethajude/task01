import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task01 {
    
    public static void main(String[] args){

        //Variables declaration & initialisation
        String str = args[0];
        System.out.println(str);
          
        String fileName = str;
        readFile(fileName);
    }
        
        private static void readFile(String fileName) {
            List<String> listString = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            String[] listOfWords = null;
            try {
                try (Stream<String> stream = Files.lines(Paths.get(fileName)))
                 {     
                   stream.map(list -> list.replaceAll("\\p{P}", "")).forEach(list -> stringBuilder.append(list).append("\n"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
    
                listOfWords = stringBuilder.toString().split(" ");
                listString = Arrays.stream(listOfWords).collect(Collectors.toList());
                Map<String, Long> listOfWordWithCount = listString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                Stream<Entry<String, Long>> listOfWordWithReverseOrder =  listOfWordWithCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10);
                listOfWordWithReverseOrder.forEach(System.out::println);
            } catch (Exception e) {
                e.printStackTrace();
            }
    
           
    

    }
    
}
