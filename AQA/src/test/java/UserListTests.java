import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.endsWith;

public class UserListTests extends BaseTest {

    @Test
    public void testEmailsEndWithReqresIn() {
        given()
                .spec(requestSpec)
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.email", everyItem(endsWith("@reqres.in")));
    }
}
