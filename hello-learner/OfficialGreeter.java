
public class OfficialGreeter implements IGreeter { // ← “implements” = I keep the promise
    @Override
    public void sayHello() {
        System.out.println( "Hello, friend!");
    }
}
