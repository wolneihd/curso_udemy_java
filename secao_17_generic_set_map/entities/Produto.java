package secao_17_generic_set_map.entities;
import java.util.Objects;

public class Produto {
    
    private String name;
    private Double price;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(name, produto.name) && Objects.equals(price, produto.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
    
}
