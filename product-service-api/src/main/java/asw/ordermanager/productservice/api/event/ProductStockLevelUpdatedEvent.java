package asw.ordermanager.productservice.api.event;

import asw.ordermanager.common.api.event.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductStockLevelUpdatedEvent implements DomainEvent {

    private String name;
    private int stockLevel;

}
