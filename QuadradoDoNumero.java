import java.util.Scanner;
public class QuadradoDoNumero {
public static void main(String[] args) {
	int a = 0;	
	
	// Codigo simples do curso de logica de programação em java da algworks	
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Olá, esreva um número para que possamos calcular o seu quadrado: ");
	a = ler.nextInt();
	System.out.println("Muito bom.");
	int b = a;
	int Resultado = a * b;
	System.out.print("O  quadrado deste número é: " + Resultado);
	
	
}
}
