import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RegistrationTests extends BaseTest {

    @Test
    public void testSuccessfulRegistration() {
        String requestBody = """
                {
                    "email": "eve.holt@reqres.in",
                    "password": "pistol"
                }
                """;

        given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
    }

    @Test
    public void testRegistrationWithoutPassword() {
        String requestBody = """
                {
                    "email": "eve.holt@reqres.in"
                }
                """;

        given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/api/register")
                .then()
                .statusCode(400)
                .body("error", equalTo("Missing password"));
    }
}
