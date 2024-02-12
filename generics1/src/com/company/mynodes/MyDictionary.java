package com.company.mynodes;

public class MyDictionary <K, V> {

    protected K key;
    protected V value;

    public MyDictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue(K key) {
        if (this.key.equals(key)) {
            return this.value;
        }
        return null;
    }
}
