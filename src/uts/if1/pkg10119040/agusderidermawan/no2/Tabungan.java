/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119040.agusderidermawan.no2;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama     : Agus
 * NIM      : 10119040
 * Kelas    : IF1
 * ---UTS---
 * Deskripsi Program : program menghitung saldo tabungan
 * pendekatan berbasis objek
 */
public class Tabungan {
    private int saldo;
    public int ambilUang;
    public int saldoakhir;
    public int jumlah;
   
     
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah(){
       return jumlah; 
    }
    
    public int ambilUang(){
        return saldo-jumlah;
    }
    
    public void setAmbilUang(int ambilUang){
        this.ambilUang = ambilUang;
    }
    
    public void Tabungan(int saldo){
        Scanner scanner = new Scanner(System.in);   
        System.out.println("======Program Penarikan Uang======");
        System.out.print("Masukan Saldo Awal : ");
        this.saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        this.jumlah = scanner.nextInt();            
    }
    
    public void tampilhasil(){
        System.out.println("Saldo Anda Sekarang : "+ ambilUang());
    }
    
    public int getSaldoAkhir(){
        return saldoakhir;
    }
    
    public void setsaldoAkhir(int saldoakhir){
        this.saldoakhir = saldoakhir;
        
    }
}
