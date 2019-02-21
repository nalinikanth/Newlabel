package producttests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import util.PropertiesReader;

public class ProductBaseTest {


    static String baseURI;
    Response response;

    static void envDetails() {
        PropertiesReader.load(System.getProperty("user.dir") + "/src/main/resources/env.properties");
        baseURI = PropertiesReader.get("url");
    }

    @BeforeSuite
    public void setUp() {
        envDetails();
        RestAssured.baseURI = baseURI;
    }

}
