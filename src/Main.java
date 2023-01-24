import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media = 0;

		System.out.println("CÁLCULO DA MÉDIA PONDERADA");
		System.out.print("Digite a Quantidade de Números para Análise: ");
		n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			double pri, seg, ter;
			
			System.out.println((i+1) + "º Caso: ");
			System.out.print("Digite os Número para Média Ponderada: ");
			pri = sc.nextDouble();
			seg = sc.nextDouble();
			ter = sc.nextDouble();		
				
			media = (pri * 2 + seg * 3 + ter * 5) / 10;
			System.out.printf("Média Ponderada = %.1f%n", media);
					
		}
		
		sc.close();
	}

}
