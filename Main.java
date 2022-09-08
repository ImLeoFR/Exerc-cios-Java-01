import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    int diasto, anos, meses, dias;

    System.out.println("Qual o valos de dias totais?");
    diasto = scan.nextInt ();

    anos = (diasto /365);
    meses = (diasto/30);

    System.out.println("Sua idade em dias é de " + diasto + ", sua idade em meses e de " + meses + " e sua idade em anos é de " + anos + ".");


    

    
  }
}