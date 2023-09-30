import java.util.Scanner;

public class ejercicioocho {
     public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
      int n;
      System.out.println("ingrese su edad: ");
      n = dato.nextInt();
      
      if(n>=60){
          System.out.println("es adulta");
      }
      else{
          System.out.println("no es adulta");
      }
      if(n>=60){
          System.out.println("es jubilada");
      }
      if(n<=60){
          System.out.println("no es jubilada");
      }
    }
}
