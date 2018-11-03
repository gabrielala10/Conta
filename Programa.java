package count;

import java.util.Scanner;

public class Programa
{	
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in); 
		Conta contas[] = new Conta[50];
		Menu interf = new Menu();

		int opcao, tarefa, numeroaux, total = 0, i;
		double valor;
		String senhaAux, senhaNova;
				
		
		do
		{
			opcao = interf.menu();
			if(opcao == 1)
			{
				tarefa = interf.menuGerente();
				switch(tarefa)
				{
				case 1:
					interf.menuGerenteCriar();
					total = criarConta(contas, total);
					break;
				case 2:
					System.out.printf("Digite o número da conta:\n");
					imprimirConta(total, contas);
					break;	
				case 3:
					for(i=0;i<total;i++)
						contas[i].aplicarJuros();
					break;
				case 4:
					for(i=0;i<total;i++)
						contas[i].aplicarRendimento();
					break;
				case 5:
					for(i=0;i<total;i++)
					{	
						contas[i].printAll();
						System.out.printf("\n");
					}
					break;
				default:
					System.out.printf("Opcao invalida\n");
					break;
				}
			}
			else if(opcao == 2)
			{
				tarefa = interf.menuCliente1();
				if(tarefa==1)
				{
					do 
					{
						System.out.printf("Digite uma conta válida:\n");
						numeroaux=encontrarConta(total,contas);
					}while(numeroaux==-1);
					
					System.out.printf("Digite a senha\n");
					scanner.nextLine();
					senhaAux = scanner.nextLine();
					
					if(contas[numeroaux].comparaSenha(senhaAux)==1)
					{
						tarefa = interf.menuCliente2();
						switch(tarefa)
						{
						case 1:
							System.out.printf("Digite o valor:\n");
							valor = scanner.nextDouble();
							contas[numeroaux].sacar(valor);
							break;
						case 2:
							System.out.printf("Digite o valor:\n");
							valor = scanner.nextDouble();
							contas[numeroaux].depositar(valor);
							break;
						case 3:
							contas[numeroaux].printAll();
							break;
						case 4:
							System.out.printf("Digite a senha antiga:\n");
							scanner.nextLine();
							senhaAux = scanner.nextLine();
							System.out.printf("Digite a senha nova:\n");
							scanner.nextLine();
							senhaNova = scanner.nextLine();
							contas[numeroaux].alteraSenha(senhaAux, senhaNova);
							break;
						default:
							break;
						}
					}
				}
				else
					System.out.printf("Opção inválida\n");	
			}
		}while(opcao!=0);
		
	}
	
	public static void acessarConta (int numero, String nome, Conta contas[])
	{
		
	}
	
	public static void imprimirConta (int total, Conta contas[])
	{
		int indice = encontrarConta(total,contas);
		if(indice!=-1)
			{
				contas[indice].printAll();
			}
	}
	
	public static int encontrarConta (int total, Conta contas[])
	{
		Scanner scanner = new Scanner(System.in); 
		int numero = scanner.nextInt();

		int i, conta;
		for(i=0;i<total;i++)
		{
			conta = contas[i].getNumero();
			if(conta == numero)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int criarConta(Conta contas[],int total)
	{
		Scanner scanner = new Scanner(System.in); 
		int opcao, numero;
		double juros, limite;
		String nome;

		do
		{
			opcao = scanner.nextInt();
			scanner.nextLine();
			System.out.printf("Digite o nome do cliente:\n");
			nome = scanner.nextLine();
			System.out.printf("Digite o número da conta:\n");
			numero = scanner.nextInt();
			
			
			if(verificarNumero(contas, total, numero)==1)
			switch(opcao)
			{
			case 1:
				System.out.printf("Digite a taxa de rendimento:\n");
				juros = scanner.nextDouble();
				contas[total] = new Poupanca(nome, numero, juros);
				System.out.printf("Conta criada\n");
				total++;
				break;
			case 2:
				System.out.printf("Digite o limite:\n");
				limite = scanner.nextDouble();
				System.out.printf("Digite a taxa de juros:\n");
				juros = scanner.nextDouble();
				contas[total] = new Especial(nome,numero,limite,juros);
				System.out.printf("Conta criada\n");
				total++;
				break;	
			case 3:
				contas[total] = new Simples(nome, numero);
				System.out.printf("Conta criada\n");
				total++;
				break;	
			default:
				System.out.printf("Opcao invalida\n");
				break;
			}

		}while(opcao!=1 && opcao!=2 && opcao!=3);
		
		return total;
	}
	
	public static int verificarNumero(Conta contas[],int total, int numero)
	{
		int i, conta;
		for(i=0;i<total;i++)
		{
			conta = contas[i].getNumero();
			if (conta==numero)
			{
				System.out.printf("Esse número de conta já existe\n");
				return 0;
			}
		}
		return 1;
	}
}