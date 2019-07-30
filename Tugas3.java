package com.Pertemuan4;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        int n;
        int[] x;

        System.out.print("Input jumlah data: ");
        n=data.nextInt();
        x=new int[n];

        for(int index=0; index<n; index++)
        {
            System.out.print("Input data ke-"+ (index+1) + ": ");
            x[index] = data.nextInt();
        }

        System.out.println(" ");

        //array untuk output
        for(int y: x){
            System.out.print(y+" ");
        }

        System.out.println(" ");

        int sum=0;
        //array menjumlahkan semua data di dalam indeks array
        for(int y:x){
            sum+=y;
        }
        System.out.println("Jumlah data dalam array:"+sum);


    }
}
