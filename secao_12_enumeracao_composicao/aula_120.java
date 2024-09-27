package secao_12_enumeracao_composicao;

import java.util.Date;

import secao_12_enumeracao_composicao.entities.Order;
import secao_12_enumeracao_composicao.entities.enums.OrderStatus;

public class aula_120 {
    public static void main(String[] args) {
        
        Order order = new Order(123, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
