package POO;

public class ClientePOO {
	
	private String name;
	private String dataNasc;
	private int idade;
	private double altura;
	private String comida;
	
	
	public ClientePOO(String name, String dataNasc, int idade, double altura, String comida) {
		super();
		this.name = name;
		this.dataNasc = dataNasc;
		this.idade = idade;
		this.altura = altura;
		this.comida = comida;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getComida() {
		return comida;
	}


	public void setComida(String comida) {
		this.comida = comida;
	}
	
	
	public void imprimirInfo() {
		
		System.out.println(name+" || nasceu em : "+dataNasc+" ||  possui "+idade+" anos  || Tem "+altura+" cm   ||  Sua comida favorita é: "+comida);
		
	}

}
