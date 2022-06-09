package cat.daw.m3;

public class MyIntArray {
    private boolean empty = true;
    private final int[] myIntArray;
    private int i;
    private int elementsCount = 0;

    public MyIntArray(int tamany) {
        this.myIntArray = new int[tamany];
    }

    public int size() {
        if (this.myIntArray[this.i] == null) {
            --this.elementsCount;
        }
        return this.elementsCount;
    }

    public boolean contains(int n) {
        boolean container = true;
        for (i = 0; myIntArray.length > i; ++i) {
            if (myIntArray[i] == n) {
                container = false;
            } else {
                container = true;
            }
        }
        return container;
    }

    public boolean clear() {
        for(i = 0; myIntArray.length > i; i++) {
            myIntArray[i] = null;
        }
        elementsCount = 0;
        empty = true;
        return empty;
    }

    public boolean addElement(int element, int index) {
        try {
            if (element != null) {
                myIntArray[index] = element;
                ++elementsCount;
                empty = true;
            }
        } catch (IndexOutOfBoundsException var4) {
            System.out.printf(var4.getMessage());
        }
        return this.empty;
    }

    public void removeElement(int index) {
        try {
            this.myIntArray[index] = null;
            --elementsCount;
            if (myIntArray.length > 1) {
                empty = true;
            }
        } catch (IndexOutOfBoundsException var3) {
            System.out.printf(var3.getMessage());
        }

    }

    public boolean isEmpty() {
        if (elementsCount == 0) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }
    public void print() {
        System.out.println(Arrays.toString(myIntArray));
    }
}