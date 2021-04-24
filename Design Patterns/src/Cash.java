public class Cash extends Payment
{
    private float cashTendered;
    
    public Cash() 
    {        
        setAuthorizeBehaviour(new AuthorizeNon());

        //setPrintBehavior(new PrintCashTrans());
        
    }
    
    public Cash(float CashTendered, float am)
    {
        cashTendered = CashTendered;
        setAmount(am);
                setPrintBehavior(new PrintCashTrans(CashTendered, getAm()));

          
    }
    
    public float getCashTendered()
    {
        return cashTendered;
    }
    
    public float getAm()
    {
        return getAmount();
    }
}
