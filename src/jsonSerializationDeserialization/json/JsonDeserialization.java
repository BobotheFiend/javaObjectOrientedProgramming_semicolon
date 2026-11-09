package jsonSerializationDeserialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonSerializationDeserialization.exceptions.JsonDeserializationException;
import jsonSerializationDeserialization.model.Product;

public class JsonDeserialization {

    public static Product deserialize(String json) throws JsonDeserializationException {

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Product.class);
        } catch (JsonProcessingException e) {
            throw new JsonDeserializationException(e);
        }
    }
}
