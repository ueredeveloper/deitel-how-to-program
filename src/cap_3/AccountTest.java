
import cap_3.*;
import java.util.*;
public class AccountTest
{
	
	public static void main (String [] args){
		
		Account myAccount = new Account();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com seu nome:");
		String nome = sc.nextLine();
		myAccount.setName(nome);
		
		System.out.println(myAccount.getName());
	}
}
