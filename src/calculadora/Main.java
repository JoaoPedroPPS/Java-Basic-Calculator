package calculadora;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		calc calc = new calc();
		
		//Apresentação do menu
		
		System.out.println("***** Calculadora em Java *****");
		System.out.println("1- Soma");
		System.out.println("2- Subtracao");
		System.out.println("3- Divisao");
		System.out.println("4- Multiplicacao");

		//seleção de Operações do Menu
		
		Number firstNumber;
		Number secondNumber;
		
		Scanner leitura = new Scanner(System.in);
		Scanner readOne = new Scanner(System.in);
		Scanner readTwo = new Scanner(System.in);
		int select;
		do {
		System.out.println("digite um numero de selecao do menu: ");
		
		select = leitura.nextInt();
		
		//Soma
		
		if(select == 1) {
			System.out.println("digite o primeiro numero da operacao: ");
			firstNumber  =  readOne.nextInt();
			System.out.println("digite o segundo numero da operacao: ");
			secondNumber = readTwo.nextInt();
			System.out.println("Soma: " + calc.sum(firstNumber, secondNumber));
		}
		
		//Subtracao
		
		if(select == 2) {
			System.out.println("digite o primeiro numero da operacao: ");
			firstNumber  =  readOne.nextInt();
			System.out.println("digite o segundo numero da operacao: ");
			secondNumber = readTwo.nextInt();
			System.out.println("Subtracao: " + calc.sub(firstNumber, secondNumber));
		}
		
		//Divisao
		
		if(select == 3) {
			System.out.println("digite o primeiro numero da operacao: ");
			firstNumber  =  readOne.nextInt();
			System.out.println("digite o segundo numero da operacao: ");
			secondNumber = readTwo.nextInt();
			
			
			if(secondNumber.intValue() == 0) {
				System.out.println("Operacao Invalida");
			}
			else {
				
				System.out.println("divisao: " + calc.div(firstNumber, secondNumber));
			}
		}
		
		//Multiplicacao
		
		if(select == 4) {
			System.out.println("digite o primeiro numero da operacao: ");
			firstNumber  =  readOne.nextInt();
			System.out.println("digite o segundo numero da operacao: ");
			secondNumber = readTwo.nextInt();
			System.out.println("Multiplicacao: " + calc.mult(firstNumber, secondNumber));
		}//fim else divisao por zero check

		
		//operacao invalida
		
		if(select > 4) {
			System.out.println("Operacao Invalida");
		}
		
		List<String> operations = calc.getLastOperation();
		System.out.println("Operações realizadas");
		for (String operation : operations) {
			System.out.println(operation);
		}
	

}while(select != 0);
	}
}