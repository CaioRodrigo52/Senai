
package exercinterfaceanimal;

public class Main {

   
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato =  new Gato();
        Galo galo =  new Galo();
        Pato pato =  new Pato();
        
        
       System.out.println("Cachorro: "); 
       cachorro.emitirSom();
       cachorro.comer();
       System.out.println("Gato: ");
       gato.emitirSom();
       gato.comer();
       System.out.println("Galo: ");
       galo.emitirSom();
       galo.comer();
       System.out.println("Pato: ");
       pato.emitirSom();
       pato.comer();
    }
    
}
