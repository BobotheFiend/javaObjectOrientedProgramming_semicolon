package jsonSerializationDeserialization.json;

import jsonSerializationDeserialization.exceptions.JsonDeserializationException;
import jsonSerializationDeserialization.model.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Objects;

import static jsonSerializationDeserialization.json.JsonDeserialization.deserialize;
import static org.junit.jupiter.api.Assertions.*;

public class JsonDeserializationTest {

    public Product product(String name, String description, BigDecimal price, int quantity) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setQuantity(quantity);
        return product;
    }

    public boolean compare(Product product, Product expected) {
        return product.getName().equals(expected.getName()) &&
                product.getDescription().equals(expected.getDescription()) &&
                Objects.equals(product.getPrice(), expected.getPrice()) &&
                product.getQuantity() == (expected.getQuantity());
    }
    @Test
    public void test() throws JsonDeserializationException {
        String json = "{\"name\":\"Musa\",\"description\":\"He Dey for Gate\",\"price\":10000000,\"quantity\":1}";
        Product actual = deserialize(json);
        Product humanBeans = product("Musa", "He Dey for Gate", new BigDecimal(10_000_000), 1);

        assertEquals(humanBeans, actual);
//        assertTrue(compare(humanBeans, actual));

    }
}