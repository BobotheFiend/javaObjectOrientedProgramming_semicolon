package jsonSerializationDeserialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonSerializationDeserialization.exceptions.JsonSerializationException;
import jsonSerializationDeserialization.model.Product;

public class JsonSerialization {

    public static String serialize(Product product) throws JsonSerializationException {

        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(product);
        }catch (JsonProcessingException e){
            throw new JsonSerializationException(e.getMessage());
        }
    }
}
