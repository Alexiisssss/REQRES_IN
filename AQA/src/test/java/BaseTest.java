import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public abstract class BaseTest {
    protected static final String BASE_URL = "https://reqres.in";
    protected RequestSpecification requestSpec;

    public BaseTest() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType("application/json")
                .build();
    }
}


