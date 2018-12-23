
public class ContaPoupanca {
	
	private double saldoPoupanca;
	private static double taxaDeJurosAnual;
	
	public ContaPoupanca(double saldoPoupanca) {
		super();
		this.saldoPoupanca = saldoPoupanca;
	}

	public void calculaJurosMensal() {
		setSaldoPoupanca(getSaldoPoupanca() + (getSaldoPoupanca() * getTaxaDeJurosAnual()/12));
	}
	
	public static void modificaTaxaDeJuros(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}


	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}


	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}


	public static double getTaxaDeJurosAnual() {
		return taxaDeJurosAnual;
	}


	public static void setTaxaDeJurosAnual(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}
	
	
	
}
