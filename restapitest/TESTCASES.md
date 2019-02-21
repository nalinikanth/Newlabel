# Test cases for Products API

- [createNewProduct](../../tree/master/src/test/java/productTests/AddProductTest.java) Create a new product and verify the product is created successfully
- [deleteValidSpecificProduct](../../tree/master/src/test/java/productTests/DeleteProductTest.java)  Delete an existing product, should get deleted successfully 
- [deleteInValidSpecificProduct](../../tree/master/src/test/java/productTests/DeleteProductTest.java)  Delete a non existing product, should throw 404 not found 
- [getValidSpecificProduct](../../tree/master/src/test/java/productTests/GetProductTest.java)  Get an existing product, should get details of existing product successfully 
- [getInValidSpecificProduct](../../tree/master/src/test/java/productTests/GetProductTest.java)  Get a non existing product, should throw 404 not found 
- [getAllProducts](../../tree/master/src/test/java/productTests/GetProductsTest.java) Get all existing product, should return all existing products
- [updateValidSpecificProduct](../../tree/master/src/test/java/productTests/UpdateProductTest.java)  Update an existing product, product should get updated successfully 
- [updateInValidProduct](../../tree/master/src/test/java/productTests/UpdateProductTest.java)  update a non existing product, should throw 404 not found 
- [updateWithInValidProductBody](../../tree/master/src/test/java/productTests/UpdateProductTest.java)  update an existing product with invalid body, should throw 400 Bad request