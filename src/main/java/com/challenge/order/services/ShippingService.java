package com.challenge.order.services;

import com.challenge.order.entities.Order;
import org.springframework.stereotype.Service;

// Anotação para indicar que a classe é um componente Spring, igual o @Component só muda a semântica
@Service
public class ShippingService {

    public double shipment(Order order) {
        if(order.getBasic() < 100.00){
            return 20.00;
        } else if (order.getBasic() < 200.00){
            return 12.00;
        } else {
            return 0.00;
        }
    }

}
