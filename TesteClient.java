package POO;

public class TesteClient {

	public static void main(String[] args) {
		
		ClientePOO client = new ClientePOO("Mike","11/03/1993",30,1.78,"Hamburguer");
		
		//Impressão classe + objeto
		
		client.imprimirInfo();
		
		//Mudar alimento//
		
		client.setComida("Pizza");
		client.imprimirInfo();
		
		//Mudar altura//
		
		client.setAltura(1.80);
		client.imprimirInfo();
		
		System.out.println("\nParabens Mike acaba de fazer aniversario!");
		
		client.setIdade(31);
		client.imprimirInfo();
		
		
		
		
	}

}
