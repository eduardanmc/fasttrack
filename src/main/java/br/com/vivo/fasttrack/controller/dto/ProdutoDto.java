package br.com.vivo.fasttrack.controller.dto;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {
	
	private Long id;
	@NotNull
	@NotEmpty(message = "O campo nome não pode ser vazio")
	private String name;
	@NotNull
	@NotEmpty(message = "O campo descrição não pode ser vazio")
	private String description;
	@NotNull
	@DecimalMin(value = "0.01", message = "O valor não pode ser menor que 0")
	private BigDecimal price;
	
}
