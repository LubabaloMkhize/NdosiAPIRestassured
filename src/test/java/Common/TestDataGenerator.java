package Common;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataGenerator {
    private static final Faker faker = new Faker(new Locale("en-US"));

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String emailAddress = faker.internet().emailAddress();

}
