package ru.mirea.lab01;

public class WorkClass {
    public static void main() {
        System.out.println("Вариант задания №4:\n"+"Неотсортированный массив:");
        int[] a = new int[10];
        input(a);
        show(a);
        sort(a);
        System.out.println("Отсортированный массив:");
        show(a);
    }
    private static void input(int[] a) {
        for (int i=0; i<10; i++) {
            a[i]= (int) (Math.random()*100);
        }
    }
    private static void show(int[] a) {
        for (int i=0; i<10; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    private static void sort(int[] a) {
      int k=10/2;
      while(k>0){
          for(int i=0; i<10-k;i++){
              int j=i;
              while(j>=0 && a[j]>=a[j+k]){
                  int h=a[j];
                  a[j]=a[j+k];
                  a[j+k]=h;
                  j--;
              }
          }
          k/=2;
      }
    }
}
