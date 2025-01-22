public class Nomor1{
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);  
  
        // Input total kilometer  
        System.out.print("Masukkan total kilometer: ");  
        int totalKilometer = scanner.nextInt();  
  
        // Hitung honor taksi berdasarkan kondisi yang diberikan  
        double honorTaksi;  
        if (totalKilometer < 3) {  
            honorTaksi = 20000;  
        } else {  
            honorTaksi = 20000 + (totalKilometer - 3) * 10000;  
        }  
  
        // Output hasil  
        System.out.println("Total km: " + totalKilometer);  
        System.out.println("Honor taksi: " + honorTaksi);  
  
        scanner.close();  
        
    }
}
