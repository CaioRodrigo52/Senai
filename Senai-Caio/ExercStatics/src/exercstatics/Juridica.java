
package exercstatics;

import java.time.LocalDate;


public class Juridica extends Pessoa{
    
      private String cnpj;
      private String inscricaoEstadual;
      private double valorContrato;
      private LocalDate dataInicio;
      private LocalDate dataTermino;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, double valorContrato, LocalDate dataInicio, LocalDate dataTermino, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.valorContrato = valorContrato;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "\nPESSOA JÚRIDICA" + "\nNome: " + super.nome + "\nId: " +super.id + "\nGenero: " + super.genero.texto + "\nCNPJ: " + cnpj +
                "\nInscrição Estadual: "+ inscricaoEstadual + "\nValor do contrato: " + getValorContrato() + "\nData de ínicio: " + getDataInicio() +
                "\nData de término: " + getDataTermino() + "\nENDEREÇO: " + "Logradouro: " + this.getEndereco().getLogradouro()
                + "\nCidade: " + this.getEndereco().getCidade() + "\nUF: " + this.getEndereco().getUf() + 
                "\nNúmero: " + this.getEndereco().getNumero() 
                + "\nComplemento: " + this.getEndereco().getComplemento() +
                "\nCEP:" + this.getEndereco().getCep() ;
    }

    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getValorContrato() {
        return Util.formatarBrl(valorContrato);
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String getDataInicio() {
        return Util.formatarData(dataInicio);
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return Util.formatarData(dataTermino);
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }
      
      
    
}
