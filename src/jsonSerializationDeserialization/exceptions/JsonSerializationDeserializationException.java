package jsonSerializationDeserialization.exceptions;

public class JsonSerializationDeserializationException extends Throwable {
    public JsonSerializationDeserializationException(String message) {
        super(message);
    }
    public JsonSerializationDeserializationException(String message, Throwable cause) {
        super(message, cause);
    }
    public JsonSerializationDeserializationException(Throwable cause) {
        super(cause);
    }

}
