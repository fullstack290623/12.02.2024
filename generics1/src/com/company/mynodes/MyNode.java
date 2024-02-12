package com.company.mynodes;

public class MyNode<T> implements NodeApiGen<T> {

    protected T data;
    protected MyNode<T> next;

    public MyNode(T data, MyNode<T> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public MyNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MyNodeInt{" +
                "data=" + data +
                //", next=" + next +
                '}';
    }
}

