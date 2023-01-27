import java.io.Console;
import java.text.DecimalFormat;

public class Task02 {
    public static void main(String[] args){
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);

        Boolean exit = false;
        System.out.println("Welcome.");

        Console con = System.console();
        while(!exit){
        String action = con.readLine();
        String data[] = action.split(" ");
        
 
            double frstOperand  = Double.parseDouble(data[0]);
            double secndOperand  = Double.parseDouble(data[2]);
            String operator = data[1];
          //  System.out.println("Result :" + doOpearation(frstOperand,secndOperand,operator));
            double Result = doOpearation(frstOperand,secndOperand,operator);
            String Result1 = String.valueOf(Result);
            if(Result1.contains(".00")){
                System.out.println( format.format(Result1) );
                System.out.println(Result1);
           // DecimalFormat format = new DecimalFormat("0");
            //System.out.println(format.format(Result1));
            }
            else{
                System.out.println(Result);
            }
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
    

