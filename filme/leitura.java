import java.util.Scanner;

public class leitura {
    public static void main(String[] args){
Scanner leitura = new Scanner(System.in);


System.out.println("digite seu filme favorito");
String filme = leitura.nextLine();
System.out.println(filme);
System.out.println("qual ano de lançamento");
int anoDeLançamento = leitura.nextInt();
System.out.println("digite sua avaliação para o filme");

double avaliacao = leitura.nextDouble();


System.out.println(filme);
System.out.println(anoDeLançamento);
System.out.println(avaliacao);
    }




}
