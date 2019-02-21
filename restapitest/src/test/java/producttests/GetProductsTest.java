package producttests;

import api.ProductApi;
import org.testng.annotations.Test;

public class GetProductsTest extends ProductBaseTest{


    @Test
    public void getAllProducts(){
        response = ProductApi.getAllProducts();
        response.then()
                .statusCode(200);
    }

}

