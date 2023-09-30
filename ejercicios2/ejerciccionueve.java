import java.util.Scanner;

public class ejerciccionueve {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int n;
        System.out.println("ingrese su calificación: ");
        n = dato.nextInt();
        
        if(n>=60){
            System.out.println("es aprobado");
        }
        
          if(n<60){
            System.out.println("es  no aprobado");
        }
        
      }
}

