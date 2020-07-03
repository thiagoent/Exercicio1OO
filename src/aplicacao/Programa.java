package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.retangulo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Le ponto ao inves de virgula
										// importar atraves de ctrl+shift+O
		Scanner sc = new Scanner(System.in); // Le algo digitado
										     // importar atraves de ctrl+shift+O

		retangulo lados; // variavel lado do tipo retangulo(Classe)
						// retangulo deve ser importado por ser uma
						// classe ctrl+shift+O

		lados = new retangulo(); // instanciando a variavel, criando o objeto "x"
		
		System.out.println("Digite as medidas do retangulo: "); // Comando para imprimir na tela (ln= enter)

		lados.a = sc.nextDouble(); // Le um um valor e guarda no atributo "a" do objeto "lados"
		lados.b = sc.nextDouble(); // Le um um valor e guarda no atributo "b" do objeto "lados"

		System.out.println(lados); // Comando para imprimir, + significa concatenado, agrupado
																		
		
		
		sc.close(); // sai da leitura do teclado
	}

}
