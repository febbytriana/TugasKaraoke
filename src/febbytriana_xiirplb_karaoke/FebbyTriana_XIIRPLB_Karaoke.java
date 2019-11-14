/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febbytriana_xiirplb_karaoke;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM1-RPL16
 */
public class FebbyTriana_XIIRPLB_Karaoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama, pilihan;
        int jam, jenis, harga;
        double diskon = 0, totalharga = 0, totalh = 0, total = 0;
        
        Scanner scn = new Scanner(System.in);
        
        do{
            System.out.println("List Harga Karaoke");
            System.out.println("1. Room Small  / 55.000");
            System.out.println("2. Room Medium / 70.000");
            System.out.println("3. Room Large  / 120.000");
            System.out.println("4. Room Family / 150.000");
            System.out.println("==============================");
     
         
            System.out.print("Nama         : ");
            nama = scn.next();
            System.out.print("Pilih Jenis  : ");
            jenis = scn.nextInt();
            System.out.print("Lama Booking : ");
            jam = scn.nextInt();

            System.out.println("==============================");

            System.out.println("Nama         : " +nama);
            System.out.println("Lama Booking : " +jam);

            if(jenis==1){
                System.out.println("Anda memilih Room Small, dengan harga 55.000/jam");
                harga = 55000;
                total = harga * jam;
                System.out.println("Total Harga  : " + total);
            
            if(jam > 3){
                diskon = 0.1111;
                totalharga = total * diskon;

                totalh = total - totalharga;

                System.out.println("Total Harga : Rp. "+totalh);
            
            }
            else{
                System.out.println("Anda tidak mendapatkan diskon");
      
            }
            }
            else if(jenis==2){
                System.out.println("Anda memilih Medium, dengan harga 70.000/jam");
                harga = 70000;
                total = harga * jam;
                System.out.println("Total Harga  : " + total);
                if(jam > 3){
                    diskon = 0.1111;
                    totalharga = total * diskon;

                    totalh = total - totalharga;

                    System.out.println("Total Harga : Rp. "+totalh);
            
                }
                else{
                    System.out.println("Anda tidak mendapatkan diskon");

                }
            }
            else if(jenis==3){
                System.out.println("Anda memilih Large, dengan harga 120.000/jam");
                harga = 120000;
                total = harga * jam;
                System.out.println("Total Harga  : " + total);
                if(jam > 3){
                    diskon = 0.1111;
                    totalharga = total * diskon;

                    totalh = total - totalharga;

                    System.out.println("Total Harga : Rp. "+totalh);

            }
            else{
                System.out.println("Anda tidak mendapatkan diskon");
      
            }
            }
            else if(jenis==4){
                System.out.println("Anda memilih Family, dengan harga 150.000/jam");
                harga = 150000;
                total = harga * jam;
                System.out.println("Total Harga  : " + total);
                if(jam > 3){
                    diskon = 0.1111;
                    totalharga = total * diskon;

                    totalh = total - totalharga;

                    System.out.println("Total Harga : Rp. "+totalh);

                }
                else{
                    System.out.println("Anda tidak mendapatkan diskon");

                }
            }
            else{
                System.out.println("Error ! \nPilihan tersebut tidak ada.");
            }
            
            System.out.print("Ingin memesan?  : ");
            pilihan = scn.next();
        }
        while(pilihan.equals("y") || pilihan.equals("Y"));{
            System.out.println("Terimakasih !");
        }
            
            
     }
  }
    

