package cat.daw.m3.nivell1.wrappers;

import java.util.Arrays;

public class MyGenericArray <E>{

    private boolean empty = true;
    private final Object[] myGenericArray;
    private int i;
    private int elementsCount = 0;


    public MyGenericArray(int tamany) {

        this.myGenericArray = new Object[tamany];

    }

    public int size() {
        return elementsCount;
    }

    public boolean contains(E e) {
        boolean container = true;
        for (i = 0; myGenericArray.length > i; i++) {
            if (myGenericArray[i] == e){
                container = true;
            } else {
                container = false;
            }
        }
        return container;
    }

    public boolean clear(){
        for (i = 0; myGenericArray.length > i; i++) {
            myGenericArray[i] = null;
        }
        elementsCount = 0;
        empty = true;
        return empty;
    }

    public boolean addElement(E element, int index){
        try {
            if(element != null){
                myGenericArray[index] = element;
                elementsCount++;
                empty = true;
            }
        } catch (IndexOutOfBoundsException f){
            System.out.printf(f.getMessage());
        }
        return empty;
    }

    public void removeElement(int index){
        try {
            myGenericArray[index] = null;
            elementsCount--;
            if (myGenericArray.length > 1){
                empty = true;
            }
        } catch (IndexOutOfBoundsException f){
            System.out.printf(f.getMessage());
        }
    }

    public boolean isEmpty(){
        if(elementsCount == 0){
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    public void print() {

        System.out.println(Arrays.toString(myGenericArray));

    }

}