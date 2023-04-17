
package exercinterfaceanimal;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("auau");
    }

    @Override
    public void comer() {
        System.out.println("golden");
    }
    
    
}
