public abstract class Payment 
{
    private float amount;
    private IauthorizeBehavior authorizeBehaviour;
    private IprintBehavior printBehavior;
    
    public void performPrint() 
    {
        printBehavior.printReceipt();
    }
    public void performauthorize() 
    {
        authorizeBehaviour.authorized();
    }
    
     public void setAuthorizeBehaviour(IauthorizeBehavior authorize) 
    {
        authorizeBehaviour = authorize;
    }
    
    public void setPrintBehavior(IprintBehavior print) 
    {
        printBehavior = print;
    }
    
    public void setAmount(float Amount)
    {
        amount = Amount;
    }
    
    public float getAmount()
    {
        return amount;
    }
}