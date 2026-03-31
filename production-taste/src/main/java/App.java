package production-taste.src.main.java;
import com.github.javafaker.Faker;

public class App {
    public static void main(String[] args) {
        // We can use this because Maven is going to download it for us!
        Faker faker = new Faker();
        
        System.out.println("Generating fake data for the Garage System...");
        System.out.println("Fake Customer Name: " + faker.name().fullName());
        System.out.println("Fake Address: " + faker.address().fullAddress());
    }
}
