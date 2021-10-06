package br.com.vivo.fasttrack.config.validacao;

public class ErroDeFormularioDto {
	
	private String status_code;
	private String message;
	
	public ErroDeFormularioDto(String string, String message) {
		this.status_code = string;
		this.message = message;
	}

	public String getStatus() {
		return status_code;
	}

	public String getMessage() {
		return message;
	}

	
}
