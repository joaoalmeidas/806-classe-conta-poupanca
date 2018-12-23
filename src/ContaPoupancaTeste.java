
public class ContaPoupancaTeste {

	public static void main(String[] args) {
		
		ContaPoupanca cliente1 = new ContaPoupanca(2000);
		ContaPoupanca cliente2 = new ContaPoupanca(3000);
		
		ContaPoupanca.modificaTaxaDeJuros(4);
		
		exibeJurosClientes(cliente1, cliente2);
		
		ContaPoupanca.modificaTaxaDeJuros(5);
		
		exibeJurosClientes(cliente1, cliente2);
	}
	
	public static void exibeJurosClientes(ContaPoupanca... conta) {
		
		System.out.println("Saldo dos clientes durante doze meses com uma taxa de juros de " +ContaPoupanca.getTaxaDeJurosAnual()+ " ao ano\n");
		
		for(int i = 0; i < conta.length; i++) {
			
			System.out.printf("Cliente %d\t", i+1);	
			
		}
		
		System.out.println();
		
		for(int i = 1; i <= 12; i++) {
			
			for(int j = 0; j < conta.length; j++) {
				
				System.out.printf("%.2f\t\t", conta[j].getSaldoPoupanca());
				conta[j].calculaJurosMensal();
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("\n");
		
	}
}
