import java.util.Scanner;

public class Multiply {

public static int LIMIT = 10;


private static int getDataByScanner() {
    Scanner scanner  = new Scanner(System.in);
    System.out.println("Introduce un numero para tu tabla");
    System.out.println("Escribe 0 si deseas todas las tablas");
    int number = scanner.nextInt();
    System.out.println("");
    scanner.close();
    return number;
  
}

public static void showTable(int number) {
    System.out.printf("Tabla del %s\n",number);
    for (int i = 0; 1 <= LIMIT; i++) {
        System.out.printf("%s x %s = %s\n", number, i, number*1);

    }
    System.out.println("-------------------\n");
}

public static void main(String[] args) {

   if (num != 0) {

   }
    }
}

 

 
