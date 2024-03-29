package com.onetomany.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ItemDTO {

	private Long idItem;
	private String category;
	private String name;
	private Integer quantity;
	private Double price;
	private Long idCart;
	
}
