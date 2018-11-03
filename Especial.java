package count;

public class Especial extends Conta {
	
	private double juros;
	private double limite;
	
	public Especial()
	{ }
	
	public Especial(String nome, int numero, double limite, double juros)
	{
		super(nome,numero);
		this.juros = juros;
		this.limite = limite;
	}
	
	public void sacar(double valor)
	{	
		super.sacar(valor);
		
		if(valor<saldo)
			saldo-=valor;
		else if(valor<(saldo+limite))
		{
			if(saldo>0)
				valor-=saldo;
			saldo-=valor;
		}
	}
	
	public void aplicarJuros()
	{
		super.aplicarJuros();
		if(saldo < 0)
			saldo = saldo + saldo * juros/100;
	}
	
	public void printAll()
	{
		super.printAll();	
	 System.out.printf("Limite:\tR$ %.2f\nJuros:\t.2f%%\n\n", limite, juros);
	}
	
	public void setJuros(int juros)
	{
	 this.juros = juros;
	}
	
	public double getJuros()
	{
	 return juros;
	}
	
	public void setLimite(int limite)
	{
	 this.limite = limite;
	}
	
	public double getLimite()
	{
	 return limite;
	}
}
