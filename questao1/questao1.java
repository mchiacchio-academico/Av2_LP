package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class questao1 {
	
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		ArrayList<String> carro = new ArrayList(); 
		int opcao;
		do {
		System.out.println("==========MENU==========");
		System.out.println("(1) Cadastrar carro");
		System.out.println("(2) Listagem geral");
		System.out.println("(3) Mostrar resultados");
		System.out.println("(4) SAIR");
		System.out.println("========================");
		opcao=ler.nextInt();
		
		
		switch(opcao) {
			case 1: 
				int ano;
				int cc=0;
				int valor;
				String marca;
				String modelo;
				int soma=0;
				
				
				System.out.println("Entre com a marca do carro: ");
				marca=ler.next();

				System.out.println("Entre com o modelo do carro: ");
				modelo=ler.next();

				System.out.println("Entre com o ano do carro: ");
				ano=ler.nextInt();

				System.out.println("Entre com o valor do carro: ");
				valor=ler.nextInt();

				
				if(valor>=50000) {
					cc++;
					soma = soma+ano;
				}
				carro.add("Marca: "+marca+"\nModelo: "+modelo+"\nAno: "+ano+"\nValor: "+valor);
				System.out.println("Carro cadastrado!");
				break;
			
			case 2:
				for (int i = 0; i < carro.size(); i++) {
					System.out.println(carro.get(i));
				}
				break;
				
			case 3:
					//int media=soma/cc;  
				
				break;
		}
		}while(opcao!=4);
	}

}
