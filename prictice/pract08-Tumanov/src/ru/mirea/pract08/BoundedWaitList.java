package ru.mirea.pract08;

public class BoundedWaitList<E> extends WaitList<E> {
    /** Поле размерность*/
    private int capacity;
    /** Конструктор - создание нового объекта */
    public BoundedWaitList(int capacity){
        super();
        this.capacity=capacity;
    }
    /** метод получает размерность */
    public int getCapacity(){
        return capacity;
    }
    /** метод добавляет элемент в контент */
    public void add(E element){
        if(content.size()<capacity){
            super.add(element);
        }
        else{
            System.out.println("Емкость контента закончилась");
        }
    }
    /** Метод выводит информацию об объекте */
    @Override
    public String toString() {
        return "BoundedWaitList{" + "capacity=" + capacity + ", content=" + content + '}';
    }
}
