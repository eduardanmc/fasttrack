package br.com.vivo.fasttrack.controller.dto;

import java.math.BigDecimal;

public class ProdutoDto {
	
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}
	

}
