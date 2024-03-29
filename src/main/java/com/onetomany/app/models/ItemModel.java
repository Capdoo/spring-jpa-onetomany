package com.onetomany.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ItemModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItem;
	private String category;
	private String name;
	private Integer quantity;
	private Double price;
	
	@ManyToOne
	@JoinColumn(name="cart_id",referencedColumnName = "id_cart", nullable=false)
	private CartModel cart;

}
