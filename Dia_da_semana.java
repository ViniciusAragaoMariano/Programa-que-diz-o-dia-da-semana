package dia_da_semana;

import java.util.Scanner;

public class Dia_da_semana {

public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
int num;

System.out.println("Programa que diz o dia da semana");

System.out.println("Informe o numero: ");
num = leia.nextInt();

leia.close();

if (num == 1) {
	System.out.println("Segunda-Feira");
	}else if (num == 2) {
	System.out.println("Terça-Feira");
	}else if (num == 3) {
	System.out.println("Quarta-Feira");
	}else if (num == 4) {
	System.out.println("Quinta-Feira");
   }else if (num == 5) {
	System.out.println("Sexta-Feira");
   }else if (num == 6) {
	System.out.println("Sabado");
   }else if (num == 7) {
	System.out.println("Domingo");
   }else if (num > 7) {
	System.out.println("Esse dia não existe");             

}
}
}
