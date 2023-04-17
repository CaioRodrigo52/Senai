package funcionarioSalarioFinal;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Motoboy motoboy1 = new Motoboy("Alvo", "111.111.111-11", "11.111.111-11", Genero.MASCULINO, 1850, LocalDate.of(1994, 5, 5),"JZL-7024");
		Gerente gerente1 = new Gerente("Livia", "222.222.222-22", "22.222.222-22", Genero.FEMININO, 3215, LocalDate.of(1999, 9, 13));
		Diretor diretor1 = new Diretor("Jorge", "333.333.333-33", "33.333.333-33", Genero.MASCULINO, 9870, LocalDate.of(1981, 1, 1));
		
		
		System.out.println(motoboy1.toString());
		System.out.println(gerente1.toString());
		System.out.println(diretor1.toString());
	}
}
