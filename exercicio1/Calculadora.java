import java.util.Scanner;

public class Calculadora {
	public static void main(String[]args) {
		Scanner Scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("digite um numero");
		 a = Scan.nextInt();
		System.out.println("digite outro numero");
		 b = Scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = miltiplicacao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtracao);
		System.out.println("div " + divisao); 
		System.out.println("mult " + multiplicacao);
		
	}
	
	public static int soma(int a, int b) {
		return a+b;
	}
	public static int subtracao(int a, int b) {
		return a-b;
	}
	public static int divisao(int a, int b) {
		return a/b;
	}
	public static int miltiplicacao(int a,int b) {
		return a*b;
	}
	
}
