package ru.mirea.pract05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N=293;
        System.out.print("Задание 6\n"+"Число "+ N +" является простым: ");
        number6(N, 1);
        System.out.println("Задание 11\n"+"Вводите последовательность чисел\n"+"Для окончания введите два нуля");
        number11(2,0);
        System.out.println("Задание 15");
	    N=534523;
	    number15(N);
    }

    public static void number6(int N, int k){
        k++;
        if(k>=N){
            System.out.println("YES");
        }
        else if(N%k!=0){
            number6(N, k);
        }
        else if(N%k==0){
            System.out.println("NO");
        }
    }

    public static void number11(int pred, int k){
        Scanner scanner = new Scanner(System.in);
        int Q=scanner.nextInt();
        if(Q==0 && pred==0){
            System.out.println("Количество единиц: "+k);
        }
        else{
            if(Q==1){
                k++;
            }
            number11(Q,k);
        }
    }

    public static void number15(int N){
        if(N!=0){
            System.out.print(N%10+" ");
            number15(N/10);
        }
    }
}
