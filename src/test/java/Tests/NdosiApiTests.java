package Tests;


import RequestBuilder.NdosiApiRequestBuilder;
import org.testng.annotations.Test;

@Test
public class NdosiApiTests {
    public void loginUserTest() {
        NdosiApiRequestBuilder.loginRequest()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8");

    }
}
