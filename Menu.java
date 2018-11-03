package count;

import java.util.Scanner;

public class Menu {

	public int opcao;
	Scanner scanner = new Scanner(System.in);
	
	public int menuGerente()
	{
		System.out.printf("Escolha uma opção:\n");
		System.out.printf("1- Criar nova conta\n");
		System.out.printf("2- Visualizar conta\n");
		System.out.printf("3- Aplicar juros (conta especial)\n");
		System.out.printf("4- Aplicar rendimentos (conta poupança)\n");
		System.out.printf("5- Visualizar todas as contas\n");
		opcao = scanner.nextInt();
		return opcao;
	}
	
	public void menuGerenteCriar()
	{
		System.out.printf("Escolha uma opção:\n");
		System.out.printf("1- Conta Poupanca\n");
		System.out.printf("2- Conta Especial\n");
		System.out.printf("3- Conta Simples\n");
	}
	
	public int menu()
	{
		System.out.printf("Escolha uma opção:\n1- Gerente\n2- Cliente\n");
		opcao = scanner.nextInt();
		return opcao;
	}		
	
	public int menuCliente1()
	{
		System.out.printf("Escolha uma opção:\n");
		System.out.printf("1- Acessar conta corrente\n");
		opcao = scanner.nextInt();
		return opcao;
	}
	
	public int menuCliente2()
	{
		System.out.printf("Escolha uma opção:\n");
		System.out.printf("1- Realizar saque\n");
		System.out.printf("2- Realizar depósito\n");
		System.out.printf("3- Vizualizar informações de conta\n");
		System.out.printf("4- Alterar senha\n");
		opcao = scanner.nextInt();
		return opcao;
	}
	
	public void criarConta()
	{
		System.out.printf("Escolha uma opção:\n");
		System.out.printf("1- Conta simples\n");
		System.out.printf("2- Conta especial\n");
		System.out.printf("3- Conta poupança\n");
	}
}
