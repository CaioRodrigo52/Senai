
package exercoperacaomat;


public class Main {

    
    public static void main(String[] args) {
       
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(20, 5) + "\nSubtracão: " + subtracao.calcular(20, 5) 
                + "\nMultiplicacão: " + multiplicacao.calcular(20, 5)+ "\nDivisão: " + divisao.calcular(20, 5));
       
    }
    
}
