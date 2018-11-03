package count;

public abstract class Conta
{ 
	private int numero;
	private String nome;
	private String senha;
	public double saldo;
	
	public Conta()
	{
		
	}
	
	public Conta(String nome, int numero)
	{
		this.nome = nome;
		this.numero = numero;
		saldo = 0;
		senha = "0000";
	}
	
	public void setName(String nome)
	{
	 this.nome = nome;
	}
	public String getName()
	{
	 return nome;
	}
	
	public int comparaSenha(String senha)
	{
		if (senha.equals(this.senha))
			return 1;
		else
			return 0;
	}
	
	public void setNumeroDaConta(int numero)
	{
	 this.numero = numero;
	}
	public int getNumero()
	{
	 return numero;
	}
	
	
	public double getSaldo()
	{
	 return saldo;
	}
	
	
	public void depositar(double valor)
	{
		saldo+=valor;
	}
	
	public void aplicarJuros()
	{ }
	
	public void sacar(double valor)
	{ }
	
	public void aplicarRendimento()
	{ }
	
	public void alteraSenha(String senhaAntiga, String senhaNova)
	{
		if(senha==senhaAntiga)
			senha = senhaNova;
		else
			System.out.printf("A senha antiga está incorreta\n");
	}
	
	public void printAll()
	{
		if(saldo>=0)
			System.out.printf("Titular: %s\nConta:\t %d\nSaldo:\tR$ %.2f\n", nome, numero, saldo);
		else
			System.out.printf("Titular: %s\nConta:\t %d\nSaldo:\t-R$ %.2f\n", nome, numero, saldo*-1);
	}
}