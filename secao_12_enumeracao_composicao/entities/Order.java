package secao_12_enumeracao_composicao.entities;

import java.util.Date;

import secao_12_enumeracao_composicao.entities.enums.OrderStatus;

public class Order {
    
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Order [id =" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}
