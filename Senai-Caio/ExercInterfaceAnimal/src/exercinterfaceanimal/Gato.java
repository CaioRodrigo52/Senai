
package exercinterfaceanimal;


public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }

    @Override
    public void comer() {
        System.out.println("whiskas");
    }
    
    
}
