import java.util.Scanner;

public class Primes {

    private static int getDataByScanner() {
    Scanner scanner  = new Scanner(System.in);
    System.out.println("Dime un numero para ver si es primo");
    int number = scanner.nextInt();
    System.out.println("");
    scanner.close();
    return number;
}

private static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
        return false; 

    } 
    return true;
}

}

public static void main(String[] args){
    int number = getDataByScanner();

    String message = isPrime(number)
          ? "%s es primo" 
          : "%s no es primo";
    System.out.printf(message, number);
}

}