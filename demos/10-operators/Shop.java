import java.util.Scanner;

public class Shop {

     static final double PACKET_PRICE =20;    

     static int getDataByScanner () {
      Scanner scanner = new java.util.Scanner(System.in);
      System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU\n: ", PACKET_PRICE);
      System.out.println("Dime el número de paquetes de pantalones y camisetas: ");
      int packets = scanner.nextInt();
      System.out.print("");
      scanner.close();
      return packets;
}
     
     public static void main(String[] args) {
        int numPackets = getDataByScanner();
        System.out.println(numPackets);
        double discount;
        int shippingByPacket;
        
        if (numPackets < 5) {
           System.out.println("Numero de paquetes insuficiente");
           return;
           
         } else if (numPackets < 10) {
            discount = 0.05;
            shippingByPacket = 10 ;
         } else if (numPackets < 20) {
            discount = 0.1;
            shippingByPacket = 5 ;
         } else {
            discount = 0.15;
            shippingByPacket = 0;
         }
         

         //validos para los casos2,3 y 4
         
         double total = numPackets * PACKET_PRICE; // 100
         double finalDiscount = total * discount;  // 10% -> 10
         double totalShipping = numPackets * shippingByPacket;
         double finalPrice = total - finalDiscount + totalShipping;

         System.err.println("""
               Número de paquetes          %d
               Precio total del producto   %.2f EU
               Descuento aplicado          %.2f EU
               Gastos de envío             %.2f EU
               --------------------------------
               TOTAL                       %.2f EU
               """.formatted(numPackets, total, finalDiscount, totalShipping, finalPrice));
         
     }
   
     }

    

         
     