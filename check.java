public class check extends Payment{
    private String name;
    private String BankID;
    check(){
        this.setAuthorizeBehavior(new AuthorizeCheck());
        this.setPrintBehavior(new PrintNon());
    }
}
