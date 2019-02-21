package template;

import com.google.gson.Gson;
import util.PropertiesReader;

public class Product {
    public String name;
    public String type;
    public int price;
    public int shipping;
    public String upc;
    public String description;
    public String manufacturer;
    public String model;

    static Product product=new Product();


    public static String getProductDetails()
    {
        PropertiesReader.load(System.getProperty("user.dir") + "/src/main/resources/product.properties");
        commonBody();
        product.name=PropertiesReader.get("name");
        String jsonString = new Gson().toJson(product);
        return jsonString;
    }

    public static String getUpdatedProductDetails()
    {
        PropertiesReader.load(System.getProperty("user.dir") + "/src/main/resources/product.properties");
        commonBody();
        product.name=PropertiesReader.get("name1");
        String jsonString = new Gson().toJson(product);
        System.out.println("jsonString = " + jsonString);
        return jsonString;
    }


    public static void commonBody(){
        product.type=PropertiesReader.get("type");
        product.price=Integer.parseInt(PropertiesReader.get("price"));
        product.shipping=Integer.parseInt(PropertiesReader.get("shipping"));
        product.upc=PropertiesReader.get("upc");
        product.description=PropertiesReader.get("description");
        product.manufacturer=PropertiesReader.get("manufacturer");
        product.model=PropertiesReader.get("model");

    }

}