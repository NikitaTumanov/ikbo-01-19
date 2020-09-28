package ru.mirea.pract08;

public class UnfairWaitList<E> extends WaitList<E>{
    /** Конструктор - создание нового объекта */
    public UnfairWaitList() {
        super();
    }
    /** метод удаляет элемент из контента */
    public E remove() {
        return super.remove();
    }
    /** метод добавляет первый элемент в конец */
    public void moveToBack(E element) {
        super.add(element);
    }
}
