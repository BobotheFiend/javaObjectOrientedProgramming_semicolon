package jsonSerializationDeserialization.exceptions;

public class JsonSerializationException extends JsonSerializationDeserializationException {
    public JsonSerializationException(String message) {
        super(message);
    }
    public JsonSerializationException(String message, Throwable cause) {
        super(message, cause);
    }
    public JsonSerializationException(Throwable cause) {
        super(cause);
    }
}
