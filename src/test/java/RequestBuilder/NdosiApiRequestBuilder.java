package RequestBuilder;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static Common.BasePaths.*;
import static PayloadBuilder.NdosiApiPayloadBuilder.*;

public class NdosiApiRequestBuilder {

    public static String loginPath = "login";
    public static String registerPath = "register";
    public static String userToken;


    public static Response loginRequest() {
        Response response = RestAssured.given()
                .baseUri(ndosiApiBaseUrl)
                .basePath(loginPath)
                .contentType(ContentType.JSON)
                .log().all()
                .body(loginPayload().toJSONString())
                .post()
                .then()
                .extract().response();

        userToken = response.jsonPath().getString("data.token");

        if (userToken == null || userToken.isEmpty()) {
            throw new AssertionError("Token is missing in login response!");
        }

        return response;
    }

    public static Response registerRequest() {
        Response response = RestAssured.given()
                .baseUri(ndosiApiBaseUrl)
                .basePath(registerPath)
                .contentType(ContentType.JSON)
                .log().all()
                .body(registerPayload().toJSONString())
                .post()
                .then()
                .extract().response();

        return response;
    }
}
