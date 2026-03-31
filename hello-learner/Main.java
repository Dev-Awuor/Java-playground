public class Main {
    public static void main(String[] args) {
        try {
            IGreeter mystery = GreeterFactory.create("dragon"); // unknown type
            mystery.sayHello();
        } catch (IllegalArgumentException e) {
            System.out.println("Oops! " + e.getMessage());
        }

        // normal greeters still work
        List<IGreeter> greeters = List.of(
                GreeterFactory.create("official"),
                GreeterFactory.create("cool")
        );
        for (IGreeter g : greeters) {
            g.sayHello();
        }
    }
}
