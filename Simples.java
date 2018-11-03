package count;

public class Simples extends Conta {

	public Simples()
	{}
	
	public Simples(String nome, int numero)
	{
		super(nome,numero);

	}
	
	public void printAll()
	{
		super.printAll();
		System.out.printf("\n");
	}
	
	public void sacar(double valor)
	{
		super.sacar(saldo);
		
		if(valor<saldo)
			saldo-=valor;
		else
			System.out.printf("Saldo insuficiente\n");
	}
}
