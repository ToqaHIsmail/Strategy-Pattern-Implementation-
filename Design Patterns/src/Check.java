public class Check extends Payment
{
    private String name;
    private String bankID;
    
    
    public Check(String n, String bank_id, float am)
    {
        name = n;
        bankID = bank_id;
        setAmount(am);
        setAuthorizeBehaviour(new AuthorizeCheck(am, bank_id, n));

        setPrintBehavior(new PrintNon());
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public String getBankId()
    {
        return bankID;
    }
    
    public float getAm()
    {
        return getAmount();
    }
}
