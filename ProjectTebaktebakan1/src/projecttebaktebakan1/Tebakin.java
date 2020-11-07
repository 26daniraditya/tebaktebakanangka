/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebaktebakan1;
import java.util.Scanner;

/**
 *
 * @author 26daniraditya
 */
public class Tebakin {
    int acak = (int)(Math.random() *100);
    int awal = 100;
    int tebak;

    
    void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang Di Game tebak angka milik DANI, Silakan tebak angka antara 1 samapi 100");
        do{ 
            System.out.println("Silakan Tebak: ");
            int i = input.nextInt();
            this.tebak++;
            if (awal>0){
                if (i==acak){
                    System.out.println("Bilangan Yang Anda Tebak Benar !!!");
                    break;
                }
                else if (i<acak){
                System.out.println("Bilangan Terlalu Kecil, Ayo Tebak Lagi !!!");
                }
                else if (i>acak){
                System.out.println("Bilangan Terlalu Besar, Ayo Tebak Lagi !!!");
                }
                if(awal<1){
                System.out.println("Yaaahh, Anda Gagal dalam menebak angka !!!");
                break;
                }
            }
        }while(awal>=0);
    }}