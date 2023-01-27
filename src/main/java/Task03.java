import java.io.Console;
import java.text.DecimalFormat;

public class Task03 {
    public static void main(String[] args){
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        double $last;
        Boolean exit = false;
        System.out.println("Welcome.");

        Console con = System.console();
        while(!exit){
        String action = con.readLine();
        String data[] = action.split(" ");
        if ((data[0]==String.valueOf($last))||((data[1])==String.valueOf($last))){
            $last = doOperation1(data[0],data[2],data[1]); 

        }
 
            double frstOperand  = Double.parseDouble(data[0]);
            double secndOperand  = Double.parseDouble(data[2]);
            String operator = data[1];
            if ((data[0]==String.valueOf($last))||((data[1])==String.valueOf($last))){

                $last = doOperation1(frstOperand,secndOperand,operator);
            }
          //  System.out.println("Result :" + doOpearation(frstOperand,secndOperand,operator));
            $last = doOpearation(frstOperand,secndOperand,operator);
           
                System.out.println($last);         
            
        }
        }
    
        private static double doOperation1(double i, double j, String operator) {
            switch (operator) {
                case "+":
                    
                    return i+j;
        
                case "-":
                    return i-j;
        
                case "*":
                    return i*j;
        
                case "/":
                    return i/j;
        
                default:
                    System.out.println("Please enter a valid opearator");
                    return 0;
                }
        
    }

        static double doOpearation(double i,double j, String op) {
            switch (op) {
            case "+":
                
                return i+j;
    
            case "-":
                return i-j;
    
            case "*":
                return i*j;
    
            case "/":
                return i/j;
    
            default:
                System.out.println("Please enter a valid opearator");
                return 0;
            }
        }
        
    }
    


    

