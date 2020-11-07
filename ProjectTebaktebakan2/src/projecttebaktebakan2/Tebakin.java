/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebaktebakan2;
import java.util.Scanner;

/**
 *
 * @author 26daniraditya
 */
public class Tebakin {
    int acak = (int)(Math.random() *100);
    int awal = 100;
    int tebak;
    int bonus = 0;
    int totscore;
    int nb = 50;// nilai default bonus skor
    int nbg = 0;// tidak dapat bonus

    
    void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang Di Game tebak angka milik DANI, Silakan tebak angka antara 1 samapi 100");
        do{ 
            System.out.println("Silakan Tebak: ");
            int i = input.nextInt();
            this.tebak++;
            if (awal>0){
                if (tebak<5){
                    this.bonus = this.nb;
                }
                if (tebak>5){
                    this.bonus = this.nbg;
                }
                if (i==acak){
                    System.out.println("Bilangan Yang Anda Tebak Benar !!!");
                    break;
                }
                else if (i<acak){
                this.awal-=2;
                System.out.println("Bilangan Terlalu Kecil, Ayo Tebak Lagi !!!");
                System.out.println("Ayo!!! Masih ada "+this.awal+" kali lagi");
                }
                else if (i>acak){
                this.awal-=2;
                System.out.println("Bilangan Terlalu Besar, Ayo Tebak Lagi !!!");
                System.out.println("Ayo!!! Masih ada "+this.awal+" kali lagi");
                }
                if(awal<1){
                this.awal=0;
                this.bonus=0;
                System.out.println("Yaaahh, Anda Gagal dalam menebak angka !!!");
                break;
                }
            }
        }while(awal>=0);
    }
    void totalScore(){
    this.totscore = this.awal + this.bonus;
    }
    void output(){
    System.out.println("Nilai Anda: " + this.awal);
    System.out.println("Bonus Nilai: " + this.bonus);
    System.out.println("Total Nilai: " + this.totscore);
    }
}
