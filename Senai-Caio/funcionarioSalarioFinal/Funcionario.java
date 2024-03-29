package funcionarioSalarioFinal;

import java.time.LocalDate;

public abstract class Funcionario {
	protected String nome, cpf, rg;
	protected Genero genero;
	protected double salarioBase;
	protected LocalDate dataAdmissao;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getSalarioBase() {
		return Util2.formatarBrl(salarioBase);
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getDataAdmissao() {
		return Util2.formatarData(dataAdmissao);
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public abstract double getSalarioFinal(double salarioBase);
		
}
