import java.util.Scanner;

public class ejerciciosiete {
     public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
      int n;
      System.out.println("ingrese su edad: ");
      n = dato.nextInt();
      
      if(n>=18){
          System.out.println("es mayor de edad");
      }
      else{
          System.out.println("es menor de edad");
      }
      if(n>=18){
          System.out.println("tiene permiso de conducir");
      }
    }
}
