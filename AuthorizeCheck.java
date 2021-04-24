public class AuthorizeCheck implements iauthorizeBehavior {
    @Override
    public void authorized() {
        System.out.println("authorized");
    }
}
