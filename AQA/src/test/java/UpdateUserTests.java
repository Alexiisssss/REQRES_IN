import io.restassured.response.Response;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class UpdateUserTests extends BaseTest {

    @Test
    public void testUpdateUser() {
        String requestBody = """
                {
                    "name": "morpheus",
                    "job": "zion resident"
                }
                """;

        Response response = given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        String updatedAt = response.jsonPath().getString("updatedAt");
        System.out.println("UpdatedAt from API: " + updatedAt);

        LocalDate updatedDate = ZonedDateTime.parse(updatedAt)
                .withZoneSameInstant(ZoneId.systemDefault())
                .toLocalDate();
        System.out.println("Converted local date: " + updatedDate);

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current local date: " + currentDate);

        assertTrue("Дата обновления не совпадает с текущей локальной датой", updatedDate.equals(currentDate));
    }
}
