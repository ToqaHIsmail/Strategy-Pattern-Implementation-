public class AuthorizeCheck implements IauthorizeBehavior
{
    float amount;
    String bankID;
    String name;
    
    public AuthorizeCheck(float am, String bank_id, String Name)
    {
        amount = am;
        bankID = bank_id;
        name = Name;
        
    }
    public void authorized() 
    {
        System.out.println("-------------------------------------");
        if(bankID.matches("\\d{12}"))
        {
            System.out.println("    Check   ");
            System.out.println("Pay By: " + name);
            System.out.println("Bank ID: " + bankID);
        }
        
        else
        {
            System.out.print("The Check is unauthorized");
        }
        System.out.println("-------------------------------------");
    }  
}
