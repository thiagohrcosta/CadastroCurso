import java.util.Locale;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static int cadastrarNovoAluno;

	
	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Criando primeira Instância
		
		Curso c1 = new Curso();
		c1.id = 1;
		c1.nome = "HTML Básico";
		c1.cargaHoraria = 10;
		c1.valor = 80;
		c1.notaPrevista = 100;
		c1.notaMinima = 70;
		
		Turma t1 = new Turma();
		t1.id = 1;
		t1.numeroDaTurma = 1;		
		// t1.dataInicio = ;
		t1.vagas = 30;
		
		MatriculaAluno ma1 = new MatriculaAluno();
		ma1.prestacoes = 6;
		
		Aluno a1 = new Aluno();
		a1.id = 1;
		a1.nome = "João da Silva";
		a1.cpf = 1111111111;
		
		Resultado r1 = new Resultado();
		r1.notaObtida = 35.0;
		
		Resultado r3 = new Resultado();
		r3.notaObtida = 36.6;
		
		System.out.println("========================================================================================================================   ");
		System.out.println("Nome do Aluno : " + a1.nome);
		System.out.println("Curso Matriculado: " + c1.nome + " | Carga horária : " + c1.cargaHoraria );
		System.out.println("Tem o valor de : R$ " + c1.valor + " | O aluno " + a1.nome + " efeutou o pagamento em : " + ma1.prestacoes + " parcelas. ");
		System.out.printf("Valor das parcelas : R$  %.2f %n ", (c1.valor / ma1.prestacoes));
		System.out.println("========================================================================================================================   ");
		System.out.println("Nota Avaliação 1 : " + r1.notaObtida);
		System.out.println("Nota Avaliação 2 : " + r3.notaObtida);
		
		if ((r1.notaObtida + r3.notaObtida) > 70) {
			System.out.println("O aluno foi aprovado com a nota de : " + (r1.notaObtida + r3.notaObtida));
		}
		else {
			System.out.println("Aluno reprovado.");
		}
		
		// Criando segunda instância
		
		Aluno a2 = new Aluno();
		a2.id = 2;
		a2.nome = "Maria da Silva";
		a2.cpf = 222222222;
		
		MatriculaAluno ma2 = new MatriculaAluno();
		ma2.prestacoes = 2;
		
		Resultado r2 = new Resultado();
		r2.notaObtida = 36.6;
		
		Resultado r4 = new Resultado();
		r4.notaObtida = 54.2;
		
		
		System.out.println("========================================================================================================================   ");
		System.out.println("Nome do Aluno : " + a2.nome);
		System.out.println("Curso Matriculado: " + c1.nome + " | Carga horária : " + c1.cargaHoraria );
		System.out.println("Tem o valor de : R$ " + c1.valor + " | O aluno " + a2.nome + " efeutou o pagamento em : " + ma2.prestacoes + " parcelas. ");
		System.out.printf("Valor das parcelas : R$  %.2f %n" , (c1.valor / ma2.prestacoes));
		System.out.println("========================================================================================================================   ");
		System.out.println("Nota Avaliação 1 : " + r2.notaObtida);
		System.out.println("Nota Avaliação 2 : " + r4.notaObtida);
		
		if ((r1.notaObtida + r3.notaObtida) > 70) {
			System.out.println("O aluno foi aprovado com a nota de : " + (r2.notaObtida + r4.notaObtida));
		}
		else {
			System.out.println("Aluno reprovado.");
		}
		
		// Criando Terceira Instância - Aluno Reprovado
		
		Aluno a3 = new Aluno();
		a3.id = 3;
		a3.nome = "Bill Gates";
		a3.cpf = 444444444;
		
		MatriculaAluno ma3 = new MatriculaAluno();
		ma3.prestacoes = 3;
		
		Resultado r5 = new Resultado();
		r5.notaObtida = 16.6;
		
		Resultado r6 = new Resultado();
		r6.notaObtida = 24.2;
		
		System.out.println("========================================================================================================================   ");
		System.out.println("Nome do Aluno : " + a3.nome);
		System.out.println("Curso Matriculado: " + c1.nome + " | Carga horária : " + c1.cargaHoraria );
		System.out.println("Tem o valor de : R$ " + c1.valor + " | O aluno " + a3.nome + " efeutou o pagamento em : " + ma3.prestacoes + " parcelas. ");
		System.out.printf("Valor das parcelas : R$  %.2f %n", (c1.valor / ma3.prestacoes));
		System.out.println("========================================================================================================================   ");
		System.out.println("Nota Avaliação 1 : " + r5.notaObtida);
		System.out.println("Nota Avaliação 2 : " + r6.notaObtida);
		
		if ((r5.notaObtida + r6.notaObtida) > 70) {
			System.out.println("O aluno foi aprovado com a nota de : " + (r5.notaObtida + r6.notaObtida));
		}
		else {
			System.out.println("Aluno reprovado. A soma de suas avaliações foi de apenas : " + (r5.notaObtida + r6.notaObtida));
		}
		
		System.out.println("========================================================================================================================  ");
		System.out.printf("Tendo por base as notas acima, constata-se que a média das notas da primeira prova foi de : %.2f %n", ((r1.notaObtida + r2.notaObtida + r5.notaObtida) / 3));
		System.out.printf("Tendo por base as notas acima, constata-se que a média das notas da segunda prova foi de : %.2f %n", ((r3.notaObtida + r4.notaObtida + r6.notaObtida) / 3));

		System.out.println("No primeiro mês a instituição recebeu : R$ " + ((c1.valor / ma1.prestacoes) + (c1.valor / ma2.prestacoes) + (c1.valor / ma3.prestacoes))  + " referente aos valores pagos pelos alunos. ");
		System.out.println("========================================================================================================================  ");
		System.out.println("**********************************************************************************************************************   ");		
		System.out.println("========================================================================================================================   ");
		System.out.println("Você gostaria de cadastrar novo Aluno? 1 - Sim  ; 2 - Não");
		
		int cadastrar = 1;
		int naocadastar = 2;
		
		cadastrarNovoAluno = sc.nextInt();
		
		if(cadastrarNovoAluno == 1) {
			System.out.println("Vamos dar início ao cadastro do novo aluno");
			
			
			Aluno a4 = new Aluno();
			System.out.println("Digite o código do Aluno:");
			a4.id = sc.nextInt();
			while (a4.id <= 3) {
				System.out.println("Este código já pertence a um Aluno, digite outro:");
				a4.id = sc.nextInt();
			}
			
			System.out.println("Digite o nome do novo Aluno : ");
			a4.nome = sc.nextLine();
			sc.nextLine();

			System.out.println("O aluno" + a4.nome + "efetuará o pagamento do Curso " + c1.nome + " em quantas parcelas ?");

			
			MatriculaAluno ma4 = new MatriculaAluno();
			ma4.prestacoes = sc.nextInt();
			
			System.out.println("Qual foi a nota do Aluno " + a4.nome + " na primeira avaliação? ");
			Resultado r7 = new Resultado();
			r7.notaObtida = sc.nextDouble();
			
			System.out.println("Qual foi a nota do Aluno " + a4.nome + "na segunda avaliação?");
			Resultado r8 = new Resultado();
			r8.notaObtida = sc.nextDouble();
			
			System.out.println("========================================================================================================================  ");
			System.out.println("**********************************************************************************************************************   ");		
			System.out.println("========================================================================================================================   ");
			
			System.out.printf("O valor da parcela paga pelo aluno " + a4.nome + "foi de : R$ %.2f %n ", (c1.valor / ma4.prestacoes));
			System.out.println("");
			System.out.println("O aluno " + a4.nome + " teve nota total de " + (r7.notaObtida + r8.notaObtida)  + " , sua condição é de: ");
			if ((r7.notaObtida + r8.notaObtida) > 70) {
				System.out.println("####### Aprovado ####### ");
			}
			else {
				System.out.println(" ######### Reprovado #############");
			}
			
		}
		else {
			System.out.println("Programa Finalizado.");
		}

		
		sc.close();
		

	}

}
