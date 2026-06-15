package Tests;

import static org.hamcrest.Matchers.*;
import RequestBuilder.NdosiApiRequestBuilder;
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

}
