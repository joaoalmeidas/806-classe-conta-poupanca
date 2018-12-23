import java.math.BigDecimal;
import java.math.MathContext;

public class ContaPoupanca {
	
	private BigDecimal saldoPoupanca;
	private static BigDecimal taxaDeJurosAnual;
	
	public ContaPoupanca(double saldoPoupanca) {
		super();
		this.saldoPoupanca = BigDecimal.valueOf(saldoPoupanca);
	}

	public void calculaJurosMensal() {
		/*
		BigDecimal porcentagemMes = taxaDeJurosAnual.divide(BigDecimal.valueOf(12.0), MathContext.DECIMAL128);
		BigDecimal saldoDivididoPor100 = getSaldoPoupanca().divide(BigDecimal.valueOf(100.0));
		BigDecimal valorJuros = porcentagemMes.multiply(saldoDivididoPor100);
		*/
		
		//setSaldoPoupanca(getSaldoPoupanca().add(valorJuros));
		
		setSaldoPoupanca(getSaldoPoupanca().
				add((taxaDeJurosAnual.
				divide(BigDecimal.valueOf(12.0), MathContext.DECIMAL128).
				multiply(getSaldoPoupanca().
				divide(BigDecimal.valueOf(100.0))))));
		
		//setSaldoPoupanca(getSaldoPoupanca() + (getTaxaDeJurosAnual()/BigDecimal.valueOf(12)) * getSaldoPoupanca() / 100 );
	}
	
	public static void modificaTaxaDeJuros(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = BigDecimal.valueOf(taxaDeJurosAnual);
	}


	public BigDecimal getSaldoPoupanca() {
		return saldoPoupanca;
	}


	public void setSaldoPoupanca(BigDecimal saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}


	public static BigDecimal getTaxaDeJurosAnual() {
		return taxaDeJurosAnual;
	}


	public static void setTaxaDeJurosAnual(BigDecimal taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}
	
	
	
}
