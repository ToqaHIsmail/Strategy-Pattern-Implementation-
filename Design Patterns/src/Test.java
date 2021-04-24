import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test 
{    
    static float amount;
    public static void main(String[] args)  throws ParseException 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please choose payment method (Enter 1 for Cash, 2 for Credit, 3 for Check): ");
        int payment = input.nextInt();
        
        
        switch (payment) 
        {
            case 1: 
                System.out.print("Enter the amount due: ");
                amount = input.nextFloat();        
                System.out.print("Enter the tendered amount: ");
                float tendered = input.nextFloat();
                
                Payment c = new Cash(tendered, amount);
                c.performPrint();
                break;
        
        //---------------------------------------
            case 2:
                System.out.print("Enter your name: ");
                String name = input.next();
                
                System.out.print("Enter your credit type (Visacard or Mastercard): ");
                String type = input.next();
                
                System.out.println("Please enter your credit card expiry date");
                String str[] = {"year", "month", "day" };
                String date = "";
                for(int i=0; i<3; i++) 
                {
                    System.out.print("Enter " + str[i] + ": ");
                    date = date + input.next() + "/";
                }
                date = date.substring(0, date.length()-1);
                System.out.println("expiryDate: "+ date); 
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date parsedDate = dateFormat.parse(date);
                
                System.out.print("Enter the amount due: ");
                amount = input.nextFloat();
                
                System.out.print("Enter your Card Number : ");
                long cardNumber = input.nextLong();
                
                Payment cr = new Credit(name, type, parsedDate, amount, cardNumber);
                
                cr.performauthorize();
                
                break;
        
        //---------------------------------------
            case 3:
                System.out.print("Enter your name: ");
                String n = input.next();

                System.out.print("Enter your bankID: ");
                String bankID = input.next();

                System.out.print("Enter the amount due: ");
                amount = input.nextInt();

                Payment ch = new Check(n,bankID, amount);

                ch.performauthorize();
        }

    }
    
}
