import java.util.Date;

public class credit extends Payment{
    private String Name;
    private String type;
    private Date expDate;
    credit(){
        this.setAuthorizeBehavior(new AuthorizeCredit1());
        this.setAuthorizeBehavior(new AuthorizeCredit2());
        this.setPrintBehavior(new PrintCashTrans());
    }
}
