// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.scanner;
import java.text.DecimalFormat;

public class ControlaClube {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new Decimalformat("#.0");
        
        System.out.println("Digite o nome do clube de futebol: ");
        String nome = sc.nextString();
        
        System.out.println("Diga quantas vitorias ele teve nessa temporada: ");
        int vitorias = sc.nextInt();
        
        System.out,println("Diga quantas derrotas ele teve nessa temporada: ");
        int derrotas = sc.nextInt();
        
        System.out.println("Diga quantos empates ele teve nessa temporada: ");
        int empates = sc.nextInt();
        
        Clube clube = new Clube(nome, vitorias, derrotas, empates);
        
        System.out.println("\nDados do clube: \n");
        System.out.println("Nome: " + clube.getNome());
        System.out.println("Total de jogos: " + clube.totalDeJogos());
        System.out.println("Pontos Ganhos: " + clube.pontosGanhos());
        System.out.println("Pontos Perdidos: " + clube.pontosPerdidos());
        System.out.println("Aproveitamente: " + df.format(clube.aproveitamente()) + "%");

        sc.close();
    }
}