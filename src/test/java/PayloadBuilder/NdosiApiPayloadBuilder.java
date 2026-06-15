package PayloadBuilder;


import Common.TestDataGenerator;
import org.json.simple.JSONObject;

public class NdosiApiPayloadBuilder {

    public static JSONObject loginPayload() {

        JSONObject loginUser = new JSONObject();
        loginUser.put("email","Tatalo.Mkhize@example.com");
        loginUser.put("password","England@123456");

        return loginUser;
    }

    public static JSONObject registerPayload() {
        JSONObject registerUser = new JSONObject();
        registerUser.put("firstName", TestDataGenerator.firstName);
        registerUser.put("lastName", TestDataGenerator.lastName);
        registerUser.put("email", TestDataGenerator.emailAddress);
        registerUser.put("password", "England@123456");
        registerUser.put("confirmPassword", "England@123456");
        registerUser.put("groupId", "5328c91e-fc40-11f0-8e00-5000e6331276");
        return registerUser;
    }
}
