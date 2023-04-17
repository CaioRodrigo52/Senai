package funcionarioSalarioFinal;

public enum Genero {
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	protected String texto;
	
	private Genero(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
}
