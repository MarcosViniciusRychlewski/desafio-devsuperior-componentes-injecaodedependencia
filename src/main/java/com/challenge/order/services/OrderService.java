package com.challenge.order.services;

import com.challenge.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Anotação para indicar que a classe é um componente Spring, igual o @Component só muda a semântica

@Service
public class OrderService {

    // Anotação para indicar que o Spring deve injetar uma instância de ShippingService
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double percent = order.getBasic() * order.getDiscount() / 100;
        return order.getBasic() - percent + shippingService.shipment(order);

    }

}
