import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.printf("==== Programa do Dobro?");
    System.out.println("Olá informe o numero?"); 
    double num = ler.nextDouble();

     double dobro = num * 2;
    
    System.out.println("O dobro é");
    System.out.println(dobro);
    
    
  }



}
