

    public class BucleFor {

    static  final int LIMIT = 10;
    static final String NAMES[] = {"Maria", "Laura","Kevin", "Pedro"};

    public static void showInfo(int counter){
        int round = counter + 1;
        System.out.println("Vuelta numero " + round );
    }

    public static void arrayFor() {

    for (int i = 0; i < NAMES.length; i++) {
        
        System.out.println("Hola" + NAMES[i]);
    }
 
    }
 
    public static void arrayForEach() {

        for (String name : NAMES) {
            System.out.println("Hola" + name);
        }
         
    }

    public static void iterateString() {
    
        String sample = "Lo que os de la gana";
        for (int i = 0; i < sample.length(); i++) {
            System.out.println(sample.charAt(i));

        }

    } 

    
    

    public static void main(String[] args) {
        
        for (int i = 0; i <= LIMIT; i++) {
            showInfo(i);
    }

    arrayFor();
    arrayForEach(); 
    iterateString(); 
}

}
      
    
    

    
