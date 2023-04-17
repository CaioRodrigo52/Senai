
package exercstatics;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("859", "1608", LocalDate.of(2002, Month.MARCH, 12), 1500, 05, "José", Genero.MASCULINO, new Endereco("Rua B", "40", "Posto", "41310", "Salvador", "BA"));
        Juridica jur1 = new Juridica("065987/59", "588", 9000, LocalDate.of(2022, Month.MARCH, 25), LocalDate.of(2023, Month.JANUARY, 12), 989, "JFFO EIRELI", Genero.FEMININO, new Endereco("Rua C", "40", "Posto", "41310", "Salvador", "BA"));
        
        System.out.println(func1.toString());
        System.out.println(jur1.toString());
    }
    
}
