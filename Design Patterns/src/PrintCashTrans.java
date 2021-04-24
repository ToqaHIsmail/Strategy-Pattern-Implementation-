public class PrintCashTrans implements IprintBehavior
{
    float tenderd;
    float amount;
    
    public PrintCashTrans(float CashTendered, float am)
    {
        tenderd = CashTendered;
        amount = am;
    }
    public void printReceipt() 
    {
      System.out.println("-------------------------------------");
      System.out.println("Payment Receipt:");
      System.out.println("Payment method: Cash ");
      System.out.println("Tendered amount:  " + tenderd);
      System.out.println("Amount:  " + amount);
      System.out.println("-------------------------------------");
      

    }
}
