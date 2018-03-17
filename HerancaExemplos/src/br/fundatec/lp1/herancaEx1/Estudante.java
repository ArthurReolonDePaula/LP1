package br.fundatec.lp1.herancaEx1;

public class Estudante extends Pessoa {

	private String matricula;
	private int quantidadeDisciplinas;
	private String turma;

	public Estudante(String nome, int idade, String cpf, int cotaDeImpressao) {
		super(nome, idade, cpf, cotaDeImpressao);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getQuantidadeDisciplinas() {
		return quantidadeDisciplinas;
	}

	public void setQuantidadeDisciplinas(int quantidadeDisciplinas) {
		this.quantidadeDisciplinas = quantidadeDisciplinas;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public void adicionaCotasDeImpressao() {
		this.cotaDeImpressao = this.cotaDeImpressao + 10;
	}

}
