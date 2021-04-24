public class Payment {
    private float amount;
    private iauthorizeBehavior authorizeBehavior;
    private iprintBehavior printBehavior;

    public iauthorizeBehavior getAuthorizeBehavior() {
        return authorizeBehavior;
    }

    public void setAuthorizeBehavior(iauthorizeBehavior authorizeBehavior) {
        this.authorizeBehavior = authorizeBehavior;
    }


    public iprintBehavior getPrintBehavior() {
        return printBehavior;
    }

    public void setPrintBehavior(iprintBehavior printBehavior) {
        this.printBehavior = printBehavior;
    }
}
