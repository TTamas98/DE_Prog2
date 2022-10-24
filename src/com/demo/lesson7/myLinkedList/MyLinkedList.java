package com.demo.lesson7.myLinkedList;

public class MyLinkedList<T> {

    private final T adat;
    MyLinkedList<T> következö;
    MyLinkedList<T> elözö;

    public MyLinkedList(T adat) {
        this.adat = adat;
    }

    public T getAdat() {
        return adat;
    }

    public MyLinkedList<T> getKövetkezö() {
        return következö;
    }

    public void setKövetkezö(MyLinkedList<T> következö) {
        this.következö = következö;
    }

    public MyLinkedList<T> getElözö() {
        return elözö;
    }

    public void setElözö(MyLinkedList<T> elözö) {
        this.elözö = elözö;
    }

    public MyLinkedList<T> add(T element) {
        if(this.következö == null) {
            this.következö = new MyLinkedList<>(element);
            this.következö.setElözö(this);
            return this.következö;
        }
        return this.következö.add(element);
    }
}
