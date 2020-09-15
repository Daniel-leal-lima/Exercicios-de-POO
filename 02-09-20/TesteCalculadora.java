import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		Calculadora cal = new Calculadora();
		
		System.out.println("Digite:\n 1 - Soma\n 2 - Subtra��o\n 3 - Multiplica��o\n 4 - Divis�o");
		int opcao = leitor.nextInt();
		
		System.out.println("Digite o primeiro operando: ");
		int operando1 = leitor.nextInt();
		System.out.println("Digite o segundo operando");
		int operando2 = leitor.nextInt();
		int resultado = 0;
		
		switch (opcao) { // similar ao if, testa e cai no case conforme
			case 1:
				resultado = cal.soma(operando1, operando2);
				break;
			case 2:
				resultado = cal.subtracao(operando1, operando2);
				break;
			case 3:
				resultado = cal.multiplicacao(operando1, operando2);
				break;
			case 4:
				resultado = cal.divisao(operando1, operando2);
				break;
			default:
				System.out.println("Op��o selecionada inv�lida!");
				leitor.close();
				break;
		}
		
		System.out.printf("Resultado = %d", resultado);
		leitor.close();
	}

}// polimorfismo = a classe possui v�rios m�todos com mesmo nome e fun��o, mas o cliente n�o sabe
// polimorfismo estatico = m�todos similares s�o diferenciados pelo compilador
