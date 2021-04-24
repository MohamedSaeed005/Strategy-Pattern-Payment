public class AuthorizeNon implements iauthorizeBehavior{
    @Override
    public void authorized() {
        System.out.println("not Authorized");
    }
}
