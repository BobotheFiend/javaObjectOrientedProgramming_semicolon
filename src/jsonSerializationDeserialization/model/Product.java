package jsonSerializationDeserialization.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
public class Product {

    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, quantity);
    }
}
