package teste;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		
		System.out.println("Calculadora - Java!!");
		System.out.println("Menu de opções - 1 a 4 ");
		System.out.println("------------------------");	
		System.out.println("1 - Adição      ");
		System.out.println("2 - Subtração    ");
		System.out.println("3 - Multiplicação    ");
		System.out.println("4 - Divisão    ");
		System.out.println("Selecione uma opção: ");
		int opcao = scn.nextInt();

	System.out.print("Digite o primeiro número: ");
		double num1 = scn.nextDouble();

	System.out.println("Digite o segundo número: ");
		double num2 = scn.nextDouble();

		switch (opcao) {
			case 1:
				System.out.println("Soma é: " + (num1 + num2));
	break;

			case 2:
			System.out.println("Subtração é: " + (num1 - num2));
	break;

			case 3:
			System.out.println("Multiplicação é: " + (num1 * num2));
	break;

			case 4:
				if (num2 != 0 ) {
					System.out.println("A divisão é: " + (num1/num2));
				}
				else {
					System.out.println("Erro! Divisão por zero não é permitida.");
                    return;
				}
				break;

	default: 
	System.out.println("Opção inválida!");
}
		scn.close();
}
}
