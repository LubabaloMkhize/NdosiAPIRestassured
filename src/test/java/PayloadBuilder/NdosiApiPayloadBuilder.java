package PayloadBuilder;


import org.json.simple.JSONObject;

public class NdosiApiPayloadBuilder {

    public static JSONObject loginPayload() {

        JSONObject loginUser = new JSONObject();
        loginUser.put("email","Tatalo.Mkhize@example.com");
        loginUser.put("password","England@123456");

        return loginUser;
    }
}
