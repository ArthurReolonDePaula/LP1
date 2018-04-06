package br.org.fundatec.lp1.ex2;

public class Empregado implements Salario, Setor{
	private int horasTrabalhadas;
	private int valorHora;
	private String sector;
	
	public Empregado(int horasTrabalhadas, int valorHora, String sector) {
		super();
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.sector = sector;
	}

	@Override
	public void MudarSetor() {
		if(this.sector.equals("vendas") || this.sector.equals("caixa")) {
			this.sector = "estoque";
		}else if(this.sector.equals("estoque")) {
			this.sector = "vendas";
		}
	}

	@Override
	public void AtribuirSetor() {
		this.sector = "caixa";
	}

	@Override
	public int CalcularSalario() {
		int salario = (this.horasTrabalhadas * this.valorHora) * 20;
		return salario;
	}
}
