import java.util.Scanner;
public class Prova {
	public static void main(String args[]) {
		String teste;
		Scanner teclado = new Scanner(System.in);
		QuestaSimples Prova[] = new QuestaSimples[1];
		QuestaoMultiplasEscolha Multipla[] = new QuestaoMultiplasEscolha[1];
		
		Prova[0] = new QuestaSimples("Quanto e 1 + 1","2");	
		Multipla[0]= new QuestaoMultiplasEscolha("a = 2","b = 3","c = 4","d = 5");
		
		for (QuestaSimples p : Prova) {
			System.out.println(p);
			//p.corrigir(teclado.nextLine());
			teste = teclado.nextLine();
			if(teste.equals("M")) {
				for (QuestaoMultiplasEscolha M : Multipla) {
					System.out.println(M);
				}
			}
			//System.out.println(p.corrigir(teste));
		}
		
		
	}
}
