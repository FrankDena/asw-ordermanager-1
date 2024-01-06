package asw.ordermanager.ordervalidationservice.domain;

import jakarta.persistence.Entity;
import lombok.*;

/* Prodotto con inventario. */
@Entity
@Data 
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product implements Comparable<Product> {

	@EqualsAndHashCode.Include
	private String name; 
	/* quantità disponibile */ 
	private int stockLevel; 
	/* prezzo di listino */ 
	private double price; 

	@Override
	public int compareTo(Product other) {
		return this.name.compareTo(other.name); 
	}
	
}
