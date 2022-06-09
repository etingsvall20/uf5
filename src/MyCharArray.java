import java.util.Arrays;

public class MyCharArray {
    private boolean empty = true;
    private final char[] myCharArray;
    private int i;
    private int elementsCount = 0;

    public MyCharArray(int tamany) {
        this.myCharArray = new char[tamany];
    }

    public int size() {
        return this.elementsCount;
    }

    public boolean contains(int n) {
        boolean container = true;
        for (i = 0; myCharArray.length > i; ++i) {
            if (myCharArray[i] == n) {
                container = false;
            } else {
                container = true;
            }
        }
        return container;
    }

    public boolean clear() {
        for(i = 0; myCharArray.length > i; i++) {
            myCharArray[i] = ' ';
        }
        elementsCount = 0;
        empty = true;
        return empty;
    }

    public boolean addElement(char element, int index) {
        try {
            if (element != ' ') {
                myCharArray[index] = element;
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
            myCharArray[index] = ' ';
            elementsCount--;
            if (myCharArray.length > 1) {
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
        System.out.println(Arrays.toString(myCharArray));
    }
}
