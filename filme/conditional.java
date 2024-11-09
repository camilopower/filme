public class conditional {
 public static void main(String[] args)    {            


int anoDeLançamento = 1990;
boolean incluidoNoPlano= true;
double notaDoFilme = 8.1;
String tipoPlano = "plus";

if(anoDeLançamento >= 2022){
    System.out.println("Lançamento que os clientes estao curtindo!");
}else {
System.out.println("Filme retro que vale apena assistir!");

}


if(incluidoNoPlano== true || tipoPlano.equals("plus")) {
System.out.println("Filme liberado");
} else {
    System.out.println("deve pagar a locaçao");



    }


}
}