public class test {
    public static void main(String[] args){
        Payment x1 = new cash();
        x1.getAuthorizeBehavior().authorized() ;
        x1.getPrintBehavior().printReceipt();

        Payment x2 = new credit();
        x2.getAuthorizeBehavior().authorized();
        x2.getPrintBehavior().printReceipt();

        Payment x3 = new check();
        x3.getAuthorizeBehavior().authorized();
        x3.getPrintBehavior().printReceipt();
    }
}
