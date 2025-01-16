import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTests extends BaseTest {

    @Test
    public void testDeleteUser() {
        given()
                .spec(requestSpec)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }
}
