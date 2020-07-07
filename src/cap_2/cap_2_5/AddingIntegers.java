import java.util.*;

/* 

 Description:
 O programa recebe dois numeros e mostra o resultado da soma 
 destes dois numeros.

 Created: 03/jul/2020 12:10

 @Author: Fabricio Jose Barrozo

 */

public class AddingIntegers
{
	public static void main(String[] args)
	{

		// cria Scanner para obter a entrada de dados do usuario 
		Scanner input = new Scanner(System.in);

		System.out.print("primeiro numero:");
		int n1 = input.nextInt();

		System.out.print("segundo numero:");
		int n2 = input.nextInt();

		int nSoma = n1 + n2;

		System.out.printf("Resultado: %d%n", nSoma);


		/*

		 2.5.1 
		 Lembrar de importar a classe Scanner:
		 java util Scanner

		 2.5.2 

		 A - Variavel
		 A.1 - e uma localizacao na memoria
		 do computador para uso posterior;
		 A.2 - deve ser declarada com nome e tipo (ex: Scanner in, int i);
		 A.3 - identifiadores validos ( a,b,c,A,B,C,1,2,3,_,$);
		 A.4 - com nome significativo, sugestivo, inteligivel (String nome, int idade);
		 A.5 - camelcase e lowercase first letter;

		 B - System.in
		 a entrada padrão, System.in, permite que os aplicativos
		 leiam bytes de dados digitados pelo usuário.

		 2.5.3 

		 2.5.4 

		 2.5.5 Obtendo a segunda variavel


		 2.5.6 Usando as variaveis no calculo

		 Calculos aritmeticos em java

		 int resultado;
		 int i, j;

		 soma: resultado = i + j
		 subtracao: resultado = i - j
		 divisao: resultado = i / j
		 multiplicacao: resultado = i * j

		 2.7 Arimethic
		 a. binary operators
		 + - * / %

		 b. straigh line forms

		 c. grouping subexpressions

		 a * (b+c) # a * b + c



		 */

	}
}
