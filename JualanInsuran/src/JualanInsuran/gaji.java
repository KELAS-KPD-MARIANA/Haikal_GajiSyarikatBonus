/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JualanInsuran;

/**
 *
 * @author ahaik
 */
import java.util.*;
public class gaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gaji_asas = 1100;
        int pelanggan,bonus,gaji;
        
        System.out.print("Berapakah bilangan pelaggan? : ");
        pelanggan = input.nextInt();
        
        if(pelanggan>=40){
            bonus = 10000;
            System.out.println("Bonus anda ialah "+bonus);
        }
        
        else if(pelanggan >=30 && pelanggan<=39){
            bonus = 8000;
            System.out.println("Bonus anda ialah "+bonus);
    }
        else if(pelanggan >=20 && pelanggan<=29){
            bonus = 6000;
            System.out.println("Bonus anda ialah "+bonus);
    }
        else if(pelanggan >=10 && pelanggan<=19){
            bonus = 4000;
            System.out.println("Bonus anda ialah "+bonus);
    }
        else if(pelanggan >=1 && pelanggan<=9){
            bonus = 2000;
            System.out.println("Bonus anda ialah "+bonus);
    }
        else{
            bonus = 0;
            System.out.println("Bonus anda ialah "+bonus);
        }
        
        gaji=gaji_asas+bonus;
        
        System.out.println("Bilangan pelanggan anda ialah "+pelanggan);
        System.out.println("Gaji anda ialah "+gaji);
        
        
    }
    
}
