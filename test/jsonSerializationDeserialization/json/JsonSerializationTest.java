package jsonSerializationDeserialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import jsonSerializationDeserialization.exceptions.JsonSerializationException;
import jsonSerializationDeserialization.model.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static jsonSerializationDeserialization.json.JsonSerialization.serialize;
import static org.junit.jupiter.api.Assertions.*;

public class JsonSerializationTest {

    @Test
    public void test() throws JsonSerializationException {
        Product phone = new Product();
        phone.setName("HI-Phone 15");
        phone.setDescription("Intoducing the new bla bla bla...");
        phone.setPrice(new BigDecimal(900_000));
        phone.setQuantity(1);

        String jsonOutput = serialize(phone);
        String expected = "{\"name\":\"HI-Phone 15\",\"description\":\"Intoducing the new bla bla bla...\",\"price\":900000,\"quantity\":1}";
        assertEquals(expected, jsonOutput);
    }
}