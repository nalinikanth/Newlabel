package producttests;

import api.ProductApi;
import org.testng.annotations.Test;
import util.PropertiesReader;
import static org.hamcrest.Matchers.equalTo;

public class AddProductTest extends ProductBaseTest{


    @Test
    public void createNewProduct() {
        response = ProductApi.createNewProduct();
        response.then().statusCode(201);
        response.then().assertThat().body("name", equalTo(PropertiesReader.get("name")));
        response.then().assertThat().body("price", equalTo(Integer.parseInt(PropertiesReader.get("price"))));
        response.then().assertThat().body("shipping", equalTo(Integer.parseInt(PropertiesReader.get("shipping"))));
        response.then().assertThat().body("type", equalTo(PropertiesReader.get("type")));
    }
}
