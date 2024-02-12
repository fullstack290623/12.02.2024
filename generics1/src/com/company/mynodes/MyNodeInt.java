package com.company.mynodes;

public class MyNodeInt implements NodeApi {

    protected int data;
    protected MyNodeInt next;

    public MyNodeInt(int data, MyNodeInt next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public MyNodeInt getNext() {
        return next;
    }

    @Override
    public void setNext(MyNodeInt next) {
        this.next = next;
    }

    @Override
    public int getData() {
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
