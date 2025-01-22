public class Nomor1{
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);  
   
        System.out.print("Masukkan total kilometer: ");  
        int totalKilometer = scanner.nextInt();  
    
        double honorTaksi;  
        if (totalKilometer < 3) {  
            honorTaksi = 20000;  
        } else {  
            honorTaksi = 20000 + (totalKilometer - 3) * 10000;  
        }  
   
        System.out.println("Total km: " + totalKilometer);  
        System.out.println("Honor taksi: " + honorTaksi);  
  
        scanner.close();  
        
    }
}
