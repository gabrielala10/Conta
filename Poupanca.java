package count;

public class Poupanca extends Conta {
	private double juros;
	
	public Poupanca()
	{}
	
	public Poupanca(String nome, int numero, double juros)
	{
		super(nome,numero);
		this.juros = juros;
	}
	
	public void sacar(double valor)
	{
		super.sacar(valor);
		
		if(valor<saldo)
			saldo-=valor;
		else
			System.out.printf("Saldo insuficiente\n");
	}
	
	public void aplicarRendimento()
	{
		super.aplicarRendimento();		
		saldo = saldo + saldo * juros/100;

	}
	
	public void printAll()
	{
		super.printAll();	
	 System.out.printf("Rende:\tR$ %.2f%%\n\n", juros);
	}
	
	public void setJuros(int juros)
	{
	 this.juros = juros;
	}
	
	public double getJuros()
	{
	 return juros;
	}

}
