import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Aluno {

	public static void main(String [] args) {
		Scanner ler =new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int ano = cal.get(Calendar.YEAR);
		
	
	try {
		
		int idade=ler.nextInt();
		if (idade < 18 || idade  >100){ 
			
			throw new Exception("A idade não pode ser menor que 18 e não pode ser maior que 100");		
		}
		
		int ano_nasc= ler.nextInt();
		if (ano_nasc < 1980 || ano < ano_nasc) {
			throw new Exception("O ano precisa ser maior que 1980 e menor que o ano atual.");
		}
		
		int mes_nasc = ler.nextInt();
		if (mes_nasc < 1 || mes_nasc > 12) {
			throw new Exception("O mês de nascimento tem que ser maior que 1 e menor ou igual a 12.");
		}
		
		ler =  new Scanner(System.in);
		String nome = ler.nextLine();
		if (nome.isEmpty() || nome==null) {
			throw new Exception("O campo nome não pode estar vazio ou nulo.");
			
		}
	}catch(Exception e)	{
		System.out.println(e);
		
		}
	}
}
