import java.util.Scanner;

public class Shop2 {

     static final double SHIRT_PRICE = 15;
     static final double TROUSER_PRICE = 22;
             

     static int[] getDataByScanner () {
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU\n", SHIRT_PRICE);
      System.out.printf("Vendemos paquetes de pantalones y camisetas a %s EU\n", TROUSER_PRICE);
      System.out.printf("Dime el número de paquetes de pantalones: ");
      int packetsTrousers = scanner.nextInt();
      int packetsShirts = scanner.nextInt();
      System.out.print("");
      scanner.close();
      int[] result = {packetsTrousers, packetsShirts};
      return result;
      //return new int[]{packetsTrousers, packetShirts}; 
}
     
     public static void main(String[] args) {
        int[] numPackets = getDataByScanner();

    // int [numPacketsTrousers, numPackesShirt] = getDataByScanner();
      int numPacketsTrousers = numPackets[0];
      int numPacketsShirt = numPackets[1];
      int numPacketsTotal= numPacketsTrousers + numPacketsShirt;
        
        double discount = 0.15;
        int shippingByPacket = 0;
        double promotion = 0;
        
        if (numPacketsTotal < 5) {
           System.out.printf("Numero de paquetes insuficiente (%s)", numPackets);
           return;
           
         } else if (numPacketsTotal > 10) {
            discount = 0.05;
            shippingByPacket = 10 ;
         } else if (numPacketsTotal < 20) {
            discount = 0.1;
            shippingByPacket = 5 ;
         }    
         //validos para los casos2,3 y 4 
         double total = numPacketsShirt * SHIRT_PRICE + numPacketsTrousers + TROUSER_PRICE; // 100
         double finalDiscount = total * discount;  // 10% -> 10
         double totalShipping = numPacketsTotal * shippingByPacket;
         double finalPrice = total - finalDiscount + totalShipping;
      

         if (total >= 1000 ) {
             promotion = total * 0.10;
             finalPrice -= promotion;
             System.out.println("""
                   Paquetes de pantalones      %d
                   Paquetes de camisetas       %d
                   Numero de paquetes total    %d
                   -------------------------------
                   Número de paquetes          %d
                   Precio total del producto   %.2f EU
                   Descuento aplicado          %.2f EU
                   Gastos de envío             %.2f EU
                   --------------------------------
                   PROMOCION
                   Descuento                   %.2f EU
                   --------------------------------
                   TOTAL                       %.2f EU
                   """.formatted(numPacketsTrousers,numPacketsShirt,
                      numPackets, total, finalDiscount, totalShipping,
                       promotion, finalPrice));


         } else {
            double amountToPromotion = 1000 - total;  
             System.out.println("""
                   Paquetes de pantalones      %d
                   Paquetes de camisetas       %d
                   Numero de paquetes total    %d
                   -------------------------------
                   Número de paquetes          %d
                   Precio total del producto   %.2f EU
                   Descuento aplicado          %.2f EU
                   Gastos de envío             %.2f EU
                   --------------------------------
                   PROMOCION
                   Descuento                   %.2f EU
                   --------------------------------
                   TOTAL                       %.2f EU
                   """.formatted(numPacketsTrousers,numPacketsShirt,
                      numPackets, total, finalDiscount, totalShipping,
                      amountToPromotion, finalPrice));
           
         }

         
     }
   
     }
   