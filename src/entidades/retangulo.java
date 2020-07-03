package entidades;

public class retangulo {

	public double a;  // atributo da classe retangulo
	public double b;  // atributo da classe retangulo
	// Apos lido os atributos a e b são desalocados
	
	
	public double area() {  // public indica que o atributo ou método pode ser
		                   // usado em outros arquivos
		
		return a*b; // calculo da area do retangulo, e retorna
					// esse valor para o programa principal			
		}
	
	public double perimetro() { 
		return a+a+b+b;

}
	
	public double diagonal() { 
		return Math.sqrt((a*a) +(b*b));

}
	
	
	public String toString() {
		return "Area= " + area() + " Perimetro= " + perimetro() + " Diagonal= " + diagonal();
			}
}
	
