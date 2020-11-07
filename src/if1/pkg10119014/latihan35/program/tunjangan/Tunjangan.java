/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119014.latihan35.program.tunjangan;
import java.util.Scanner;
/**
 *
 * @author USER
 */
class Tunjangan {
    static String status;
    static Double gaji, tunjangan;
    
    static void inputData(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("=====Program Tunjangan=====");
        System.out.print("Berapa Gaji Pokok Perbulan? : RP. ");
        gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = scanner.next();
        while(!(status.toUpperCase().equals("MENIKAH")|| status.toUpperCase().equals("BELUM"))){
        System.out.print("status Anda?(Menikah/Belum)\t: ");
                status = scanner.next();
        }
}
public static void cekStatus(){
tunjangan = (status.toUpperCase().equals("MENIKAH")) ? hitungTunjangan(gaji):0.0;
}
public static double hitungTunjangan(double gaji){
    double hitungTunjangan = 0.35 * gaji;
    return hitungTunjangan;
}

public static void tampilFormat(){
    System.out.println("=====Hasil Perhitungan Gaji Anda=====");
    System.out.println("Gaji Pokok\t\t\t: Rp. " + gaji);
    System.out.printf("Tunjangan\t\t\t: Rp. %.1f%n", tunjangan);
    double totalGaji = gaji + tunjangan;
    System.out.println("Total Gaji\t\t\t: Rp. " + totalGaji);
    System.out.println("Develoved by : Andri Dwi P");
}
}

