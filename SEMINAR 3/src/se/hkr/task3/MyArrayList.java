package se.hkr.task3;

import java.util.Arrays;

public class MyArrayList <T> {
    private T[]  list;
    private int length;


    public MyArrayList() {
        this.list  = (T[]) new Object[10];
        length = 0;
    }

    public void add (T o){
        if(this.list.length == length) {
            grow();
        }
        this.list[length] = o;
        length++;
    }

    public T get(int index) {
        T o;
        try {
            o = this.list[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
        return o;
    }

    public int size(){
        return this.length;
    }


    public boolean isEmpty(){
        if(this.length == 0){
            return true;
        }else {
            return false;
        }
    }

    public void grow (){
        T[] newList;
        newList = Arrays.copyOf(this.list, this.list.length + 10);
        this.list = newList;

    }



}
