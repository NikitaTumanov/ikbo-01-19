package ru.mirea.pract08;

import java.util.Collection;

public interface IWaitList<E> {
    /** Метод добавляет элемент в коллекцию */
    public void add(E element);
    /** Метод удаляет элемент из коллекции */
    public E remove();
    /** метод проверяет содержание указанной String последовательности символов*/
    public  boolean contains(E element);
    /** метод проверяет содержание указанной коллекции*/
    public boolean containsAll(Collection<E> c);
    /** метод проверяет пустоту коллекции*/
    public boolean isEmpty();
}
