public class Main {
    public static void main(String[] args) {
        MyIntArray myIntArray1 = new MyIntArray(10);
        System.out.printf("The size is: " + myIntArray1.size() + ". Look: ");
        myIntArray1.print();
        System.out.printf("\nIs the number 5 in? True or false: " + myIntArray1.contains(5));
        System.out.printf("\nThere was no number added. True or false: " + myIntArray1.isEmpty());
        myIntArray1.print();
        System.out.printf("\nIf we clear our list, it will be empty. True or false? " + myIntArray1.clear());
        System.out.printf("\nWe will add the number 1 on top of the list. ");
        myIntArray1.addElement(1, 0);
        System.out.printf("\nWhen a new element is added, the length increases: " + myIntArray1.size());
        myIntArray1.print();
        System.out.printf("\nNow we will add the number 2 ");
        myIntArray1.addElement(2, 1);
        myIntArray1.print();
        System.out.printf("\nNext the number 5 will be added into the 5th position ");
        myIntArray1.addElement(5, 4);
        myIntArray1.print();
        System.out.printf("\nIs the number 5 in? True or false: " + myIntArray1.contains(5));
        System.out.printf("\nWhat happens if we try to add a number that is greater than our list length? ");
        myIntArray1.addElement(12, 20);
        myIntArray1.print();
        System.out.printf("\nWe will remove the number 1. Before, we must check the length: " + myIntArray1.size());
        myIntArray1.removeElement(1);
        System.out.printf("\nAfter removing the element we can check the length also changed: " + myIntArray1.size());
        System.out.printf("\nCan we remove a number that wasn't stored? ");
        myIntArray1.removeElement(654);
        System.out.printf("Is the array empty? True or false.");
        myIntArray1.isEmpty();

        //chars
        MyCharArray myCharArray1 = new MyCharArray(10);
        System.out.printf("The size is: " + myCharArray1.size() + ". Look: ");
        myCharArray1.print();
        System.out.printf("\nIs the char 5 in? True or false: " + myCharArray1.contains(5));
        System.out.printf("\nThere was no char added. True or false: " + myCharArray1.isEmpty());
        myCharArray1.print();
        System.out.printf("\nIf we clear our list, it will be empty. True or false? " + myCharArray1.clear());
        System.out.printf("\nWe will add the char a on top of the list. ");
        myCharArray1.addElement('y', 0);
        System.out.printf("\nWhen a new element is added, the length increases: " + myCharArray1.size());
        myCharArray1.print();
        System.out.printf("\nNow we will add the char 5: ");
        myCharArray1.addElement('5', 1);
        myCharArray1.print();
        System.out.printf("\nNext the char c will be added into the 5th position ");
        myCharArray1.addElement('c', 4);
        myCharArray1.print();
        System.out.printf("\nIs the char c in? True or false: " + myCharArray1.contains(5));
        System.out.printf("\nWe will remove the number 1. Before, we must check the length: " + myCharArray1.size());
        myCharArray1.removeElement(1);
        System.out.printf("\nAfter removing the element we can check the length also changed: " + myCharArray1.size());
        System.out.printf("\nCan we remove a char that wasn't stored? ");
        myCharArray1.removeElement(654);
        System.out.printf("Is the array empty? True or false.");
        myCharArray1.isEmpty();

        //Theatre
        Theatre theatre1 = new Theatre("Apolo", 7, 2);
        theatre1.getSeats();
        if(theatre1.reserveSeat("G21")) {
            System.out.println("Please pay now.");
        } else {
            System.out.println("Sorry... The seat is taken.");
        }
        if(theatre1.reserveSeat("G21")) {
            System.out.println("Please pay now.");
        } else {
            System.out.println("Sorry... The seat is taken.");
        }

        //GenericArray
        cat.daw.m3.nivell1.wrappers.MyGenericArray<Integer> myIntegerArray = new cat.daw.m3.nivell1.wrappers.MyGenericArray<>(10);
        System.out.printf("The size is: " + myIntegerArray.size() + ". Look: ");
        myIntegerArray.print();
        System.out.printf("\nIs the number 5 in? True or false: " + myIntegerArray.contains(5));
        System.out.printf("\nThere was no number added. True or false: " + myIntegerArray.isEmpty());
        myIntegerArray.print();
        System.out.printf("\nIf we clear our list, it will be empty. True or false? " + myIntegerArray.clear());
        System.out.printf("\nWe will add the number 1 on top of the list. ");
        myIntegerArray.addElement(1, 0);
        System.out.printf("\nWhen a new element is added, the length increases: " + myIntegerArray.size());
        myIntegerArray.print();
        System.out.printf("\nNow we will add the number 2 ");
        myIntegerArray.addElement(2, 1);
        myIntegerArray.print();
        System.out.printf("\nNext the number 5 will be added into the 5th position ");
        myIntegerArray.addElement(5, 4);
        myIntegerArray.print();
        System.out.printf("\nIs the number 5 in? True or false: " + myIntegerArray.contains(5));
        System.out.printf("\nWhat happens if we try to add a number that is greater than our list length? ");
        myIntegerArray.addElement(12, 20);
        myIntegerArray.print();
        System.out.printf("\nWe will remove the number 1. Before, we must check the length: " + myIntegerArray.size());
        myIntegerArray.removeElement(1);
        System.out.printf("\nAfter removing the element we can check the length also changed: " + myIntegerArray.size());
        System.out.printf("\nCan we remove a number that wasn't stored? ");
        myIntegerArray.removeElement(654);

        cat.daw.m3.nivell1.wrappers.MyGenericArray<String> myStringArray = new cat.daw.m3.nivell1.wrappers.MyGenericArray<>(10);
        System.out.printf("\nThe size is: " + myStringArray.size() + ". Look: ");
        myStringArray.print();
        System.out.printf("\nIs the word paraula in? True or false: " + myStringArray.contains("paraula"));
        System.out.printf("\nThere was no word added. True or false: " + myStringArray.isEmpty());
        myStringArray.print();
        System.out.printf("\nIf we clear our list, it will be empty. True or false? " + myStringArray.clear());
        System.out.printf("\nWe will add the word paraula2 on top of the list. ");
        myStringArray.addElement("paraula2", 0);
        System.out.printf("\nWhen a new element is added, the length increases: " + myStringArray.size());
        myStringArray.print();
        System.out.printf("\nNext we will add the word paraula3. ");
        myStringArray.addElement("paraula3", 1);
        myStringArray.print();
        System.out.printf("\nNow the word paraula4 will be added into the 5th position");
        myStringArray.addElement("paraula4", 4);
        myStringArray.print();
        System.out.printf("\nIs the word paraula in? True or false: " + myStringArray.contains("paraula"));
        System.out.printf("\nWhat happens if we try to add a word that is greater than our list length? " );
        myStringArray.addElement("paraula5", 20);
        myStringArray.print();
        System.out.printf("\nWe will remove the word paraula2. Before, we must check the length: " + myStringArray.size());
        myStringArray.removeElement(1);
        System.out.printf("\nAfter removing the element we can check the length also changed: " + myStringArray.size());
        System.out.printf("\nCan we remove a word that wasn't stored? ");
        myStringArray.removeElement(654);
}}
