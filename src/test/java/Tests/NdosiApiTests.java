package Tests;

import static org.hamcrest.Matchers.*;
import RequestBuilder.NdosiApiRequestBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

@Test
public class NdosiApiTests {

    public void loginUserTest() {
        Response response = NdosiApiRequestBuilder.loginRequest();

        response.then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("data.token", notNullValue())
                .body("data.token", not(emptyString()))
                .body("success", equalTo(true));
    }

    public void registerUserTest() {
        Response response = NdosiApiRequestBuilder.registerRequest();
        response.then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .contentType("application/json; charset=utf-8")
                .body("data.id", notNullValue())
                .body("message",comparesEqualTo("Registration submitted successfully. Your account is pending admin approval."))
                .body("success", equalTo(true));
    }

}
