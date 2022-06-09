import java.util.Arrays;

public class MyIntArray {
    private boolean empty = true;
    private final int[] myIntArray;
    private int i;
    private int elementsCount = 0;

    public MyIntArray(int tamany) {
        this.myIntArray = new int[tamany];
    }

    public int size() {
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
            myIntArray[i] = Integer.parseInt(null);
        }
        elementsCount = 0;
        empty = true;
        return empty;
    }

    public boolean addElement(int element, int index) {
        try {
            if (element == Integer.parseInt(null)) {
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
            myIntArray[index] = Integer.parseInt(null);
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
