package org.example.generics_1;

public class Pair <K,V>{
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public void print(){
        System.out.println(key +" "+value);
    }

    public K getKey() {
        return key;
    }
    public V getValue(){
        return value;
    }
}
