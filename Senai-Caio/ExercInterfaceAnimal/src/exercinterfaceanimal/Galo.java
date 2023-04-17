
package exercinterfaceanimal;


public class Galo implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("cocoricó");   
    }

    @Override
    public void comer() {
        System.out.println("milho");
    }
    
    
    
}
