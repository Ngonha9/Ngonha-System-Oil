package poo;

import java.util.Scanner;

public class System_Oil {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); //metodo para ler dados de teclados
		
		// Declaracao de variaveis
		String senha, tag, padrao, equipamento, oleo, liberar; 					// variaveis do tipo string
		equipamento="CB1703";										//inicialiazacao de variavel
		padrao="Ngonha123";											//inicializacao de variavel
		int contador, lubrificante;												//variaveis do tipo inteiro
		contador=1;													//inicializacao de variavel
		
		System.out.println("....Ngonha System Oil....");//Mensagem de sistema
		System.out.println("Digite a senha");//mensagem para accao do usuario
		senha=ler.next();//metodo para ler dados introduzidos
		
		//condicionamento caso a senha inserida seja incorrecta
		while(!senha.equals(padrao) && contador<=2) {
			System.out.println("Senha incorrecta, tentativas restantes: "+(3-contador));
			contador++;
			senha=ler.next();
		}
		
		//condicionamento caso a senha seja correcta
		if(senha.equals(padrao)) {
			System.out.println("Acesso permitido");
		}
		//condicionamento caso as tentativas de insercao de senha sejam esgotadas
		else {
			System.out.println("Acesso negado");
			System.exit(contador);
		}
		
		System.out.println("Digite o TAG do equipamento");  //mensagem para accao do usuario
		tag=ler.next();  //leitura de dados introduzidos pelo usuario
		
		//condicionamento caso o tag seja invalido
		while(!tag.equals(equipamento) && contador<=2) {
			System.out.println("TAG incorrecto, tentativas restantes: "+(3-contador));
			contador++;
			tag=ler.next();
		}
		
															//condicionamento caso o tag seja valido
		if(tag.equals(equipamento)) {
			System.out.println("Acesso permitido");
			
		}
															//condicionamento caso tentativas de insercao do tag sejam esgotadas
		else {
			System.out.println("Acesso negado");
			System.exit(contador);
			
		}
		
		System.out.println("Lubrificantes disponiveis: \n");
		System.out.println("\n 1-15W40\n 2-AZOLLA\n 3-SAE 30\n 4-10W\n 5-SAE 50\n");
		lubrificante=ler.nextInt();
		
		switch(lubrificante) {
		case 1:
					System.out.println("O oleo selecionado e 15W40");
			break;
		case 2:
					System.out.println("O oleo selecionado e AZOLLA");
					System.out.println("Digite liberar para confirmar a liberacao");
					liberar=ler.next();
					
			break;
		case 3:
					System.out.println("O oleo selecionado e SAE 30");
			break;
		case 4:
					System.out.println("O oleo selecionado e 10W");
			break;
		case 5:
					System.out.println("O oleo selecionado e SAE 50");
			break;
		default:
				System.out.println("lubrificante invalido");
			break;
		}
	
		
		
		ler.close();
	
	}
}
