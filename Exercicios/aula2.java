package aula2;


public class aula2 {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scan.next();
		System.out.printlf("Meu nome é " + nome" " + sobrenome);
		scan.close();

	}

}
