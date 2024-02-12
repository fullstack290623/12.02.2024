package com.company.mynodes;

public class MyNodeFloat  {

    protected float data;
    protected MyNodeFloat next;

    public MyNodeFloat(float data, MyNodeFloat next) {
        this.data = data;
        this.next = next;
    }

    public MyNodeFloat getNext() {
        return next;
    }

    public void setNext(MyNodeFloat next) {
        this.next = next;
    }

    public float getData() {
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

