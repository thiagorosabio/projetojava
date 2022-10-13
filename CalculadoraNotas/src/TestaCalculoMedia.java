import java.util.Scanner;

public class TestaCalculoMedia {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de media de alunos!");
        System.out.println("Digite o Nome do Aluno: ");
        
        String nome = scanner.nextLine();
        
        System.out.println("Qual o tipo do aluno? (1 = Normal, 2 = Especial,"
                + " 3 = Exatas, 4 = Humanas)");
        Integer resposta = scanner.nextInt();
        if ( resposta <= 5 ) {
            Aluno aluno;
            switch (resposta) {
            case 1:
                aluno = new Aluno(nome);
                break;
            case 2:
                aluno = new AlunoEspecial(nome);
                break;
            case 3:
                aluno = new AlunoDeExatas(nome);
                break;
            case 4:
                aluno = new AlunoDeHumanas(nome);
                break;
    
            default:
                aluno = new Aluno(nome);
                break;
            }
            aluno.perguntaNotas();
            aluno.calculaMedia();
            
            System.out.println("A situacao do aluno " + aluno.getNome());
            System.out.println("é " + aluno.pegaSituacao());
        } else {
            System.out.println("Tipo do aluno invalido!");
        }
    }
}