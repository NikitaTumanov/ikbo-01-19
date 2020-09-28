package ru.mirea.pract08;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    /** Поле контент */
    protected ConcurrentLinkedQueue<E> content;
    /** Конструктор - создание нового объекта */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }
    /** Конструктор - создание нового объекта */
    public WaitList(Collection<E> content) {
        this.content = new ConcurrentLinkedQueue<>(content);
    }
    /** Метод выводит информацию об объекте */
    @Override
    public String toString() {
        return "WaitList {" + "content = " + content + '}';
    }
    /** Метод добавляет элемент в коллекцию */
    @Override
    public void add(E element) {
        content.add(element);
    }
    /** Метод удаляет элемент из коллекции */
    @Override
    public E remove() {
        return content.remove();
    }
    /** метод проверяет содержание указанной String последовательности символов*/
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }
    /** метод проверяет содержание указанной коллекции*/
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }
    /** метод проверяет пустоту коллекции*/
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
