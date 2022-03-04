package Exercicioslaçosfor;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
		
		int nume = 10;
		int par = 0;
		int impar = 0;
		
		
		for (int i=0;i<10;i++) {
			
			
	   System.out.println("Digite o" + (i+1) + "°N:");
	   nume = leia.nextInt();
	   
	   if(nume%2==0) {
		   par++;
		   
		   
	   }else {
		   impar++;
	   }
	   
		}
		
		System.out.println("A quantidade de numeros pares são: " +par+"\nA quantidade de numeros impar são: "+impar);
		
		
		
		
				leia.close();

		
	}

}
