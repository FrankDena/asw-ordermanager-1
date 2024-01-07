package asw.ordermanager.ordervalidationservice.domain;


import asw.ordermanager.common.api.event.DomainEvent;
import asw.ordermanager.orderservice.api.event.OrderCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EventListener;
import java.util.logging.Logger;

@Service
public class OrderValidationServiceEventHandler {

    private final Logger logger = Logger.getLogger(this.getClass().toString());

    @Autowired
    private  OrderService orderService;


    public void onEvent(DomainEvent event) {

        if (event instanceof OrderCreatedEvent ev) {
            logger.info("PROCESSING ORDER CREATED EVENT: " + event);
            updateOrders(ev);
        }
    }

    private void updateOrders(OrderCreatedEvent event) {
        orderService.updateOrders(event.getCustomer(), event.getAddress(), event.getOrderItems(), event.getTotal());
    }

}
