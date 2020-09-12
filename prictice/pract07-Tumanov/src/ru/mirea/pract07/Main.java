package ru.mirea.pract07;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int count=0;
    public static void main(String[] args) {
	System.out.println("Упражнение 2");

    Queue<Integer> queue_player1 = new PriorityQueue<Integer>();
    Queue<Integer> queue_player2 = new PriorityQueue<Integer>();

    System.out.println("Введите 5 чисел для первого игрока");
    input(queue_player1);
    System.out.println("Введите 5 чисел для второго игрока");
    input(queue_player2);

    game(queue_player1, queue_player2);
    show(queue_player1, queue_player2);
    }

    private static void input(Queue<Integer> queue){
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<5;i++){
            queue.add(scanner.nextInt());
        }
        System.out.println(queue);
    }

    private static void game(Queue<Integer> pl1, Queue<Integer> pl2) {
        Queue<Integer> common = new PriorityQueue<Integer>();
        while(!pl1.isEmpty() && !pl2.isEmpty() && count<106){
            if(pl1.peek() > pl2.peek() || pl2.peek()-pl1.peek()==9){
                pl1.add(pl2.poll());
                while (!common.isEmpty()){
                    pl1.add(common.poll());
                }
            }
            else if(pl2.peek() > pl1.peek() || pl1.peek()-pl2.peek()==9){
                pl2.add(pl1.poll());
                while (!common.isEmpty()){
                    pl2.add(common.poll());
                }
            }
            else if(pl2.peek() == pl1.peek()){
                common.add(pl1.poll());
                common.add(pl2.poll());
            }
            count++;
        }
    }

    private static  void show(Queue<Integer> pl1, Queue<Integer> pl2){
        if(pl1.isEmpty() && !pl2.isEmpty()){
            System.out.println("Second");
        }
        else if(!pl1.isEmpty() && pl2.isEmpty()){
            System.out.println("First");
        }
        else{
            System.out.println("Botva");
        }
        System.out.println("Количество ходов: "+count);
    }
}
