public class cash extends Payment {
    private float cashTendered;
    cash(){
        this.setAuthorizeBehavior(new AuthorizeNon());
        this.setPrintBehavior(new PrintCashTrans());
    }
}
