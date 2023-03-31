package br.com.fiap.orientacao.lista;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	
	public Endereco(String logradouro, int numero) {
		this.logradouro = logradouro;
		this.numero = numero;
	}
	
	public Endereco(String logradouro, int numero, String bairro, String cidade) {
		this(logradouro, numero);
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public Endereco(String logradouro, int numero, String bairro, String estado, String cidade, int cep){
		this(logradouro, numero, bairro, cidade);
		this.estado = estado;
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public int getCep() {
		return cep;
	}
	
	public String toString() {
		return logradouro + ", " + numero + ", " + bairro + ", " + estado + ", " + cidade + ", " + cep;
	}
	
	public static void main(String[] args) {
		
		Endereco greg = new Endereco("Av. Miguel Estéfano", 1974);
		Endereco anne = new Endereco("Rua rosa de morais", 486, "Bela vista", "São Paulo");
		Endereco fiap = new Endereco("Lins de Vasconcelos", 1222, "Vila Mariana", "São Paulo", "São Paulo", 123456);
		
		System.out.println(greg.toString());
		System.out.println(anne.toString());
		System.out.println(fiap.toString());
		
	}
}
