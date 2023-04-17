
package exercstatics;

import java.time.LocalDate;
import java.time.Period;


public class Funcionario extends Pessoa{
     private String cpf;
     private String rg; 
     private LocalDate dataNasc;
     private double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, LocalDate dataNasc, double salario, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return ""\nFUNCIONÁRIO" + "\nNome: " + super.getNome() + "\nId: " + super.getId() + "\nGênero: " +   super.getGenero().getTexto() + "\nCPF: " + cpf + "\nRG: " + rg +
                "\nData de Nascimento: " + getDataNasc() + "\nIdade: " + getIdade() + "\nSalário: " + getSalario() + "\nENDEREÇO\n" + 
                "Logradouro: " + this.getEndereco().getLogradouro()
                + "\nCidade: " + this.getEndereco().getCidade() + "\nUF: " + this.getEndereco().getUf() + 
                "\nNúmero: " + this.getEndereco().getNumero() 
                + "\nComplemento: " + this.getEndereco().getComplemento() +
                "\nCEP:" + this.getEndereco().getCep() ; 
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
    
    public int getIdade (){
        return Period.between(this.dataNasc, LocalDate.now()).getYears();
    }

    public String getDataNasc() {
        return Util.formatarData(dataNasc);
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSalario() {
        return Util.formatarBrl(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
     
    
}
