
package exercinterfaceanimal;


public class Pato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("quaqua");
    }

    @Override
    public void comer() {
        System.out.println("grãos");
    }
    
    
}
