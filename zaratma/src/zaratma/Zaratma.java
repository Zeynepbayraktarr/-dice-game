/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaratma;
import java.util.Random;

public class Zaratma {

   
    public static void main(String[] args) {
       
        // Değişken tanımlaması:
        int zar1,zar2,deneme=1;
        Random random = new Random();
        while(true){
            zar1=random.nextInt(6)+1; // +1 Yapmasaydım 0-5 arasında random değer üretecekti.
            zar2=random.nextInt(6)+1;
            if(zar1==6 && zar2==6){
                System.out.println("--------\nBilgisayar "+deneme+" deneme yaparak zarları 6-6 atmayı başardı.");
                break; // Döngüyü kırmak için ekledik.
            }
            else{
                System.out.println("nAtılan İlk Zar: "+ zar1 +"\tAtılan İkinci Zar: "+zar2);
            }
            deneme++;
        }
    }
}
    
    

