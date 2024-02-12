package com.company.mynodes;

public interface NodeApiGen<T> {

    MyNode<T> getNext();
    void setNext(MyNode<T> next);
    T getData();


}
