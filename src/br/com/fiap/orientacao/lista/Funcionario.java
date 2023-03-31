package br.com.fiap.orientacao.lista;

public class Funcionario {
	
	private String nome;
	private long matricula;
	private Profissao profissao;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(long matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome) {
		this(matricula);
		this.nome = nome;
	}
	
	public Funcionario(long matricula, String nome, Profissao profissao) {
		this(matricula, nome);
		this.profissao = profissao;
	}
	
	public void exibirDadosFuncionario() {
		System.out.println(nome + " - " + matricula + " - " + profissao.getNome() + " - " + salario);
	}
	
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	public static void main(String[] args) {
		Profissao profGreg = new Profissao("Monitor");
		Funcionario greg = new Funcionario(191919, "Gregory", profGreg);
		
		greg.exibirDadosFuncionario();
	}
	
}
