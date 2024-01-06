package asw.ordermanager.ordervalidationservice.domain;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/* Ordine. */
@Entity
@Table(name="ORDERS")
@Data 
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order implements Comparable<Order> {

	@EqualsAndHashCode.Include
	private Long id; 	
	private String customer; 
	private List<OrderItem> orderItems;
	private double total; 

	@Override
	public int compareTo(Order other) {
		return this.id.compareTo(other.id); 
	}
	
}
