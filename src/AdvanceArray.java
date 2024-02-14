public class AdvanceArray {
    Object[] array = new Object[3];
    int size = 0;
    int capacity = 3;

    public void addObject(Object AdvancedArray) {
        if (size == capacity) {
            capacity += 3;
            Object[] newArray = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = AdvancedArray;
    }

    public static void main(String[] args) {
        Main FinArray = new Main();
        FinArray.addObject("1");
        FinArray.addObject("2");
        FinArray.addObject("3");
        System.out.println(FinArray.size);
        //System.out.println(main.array[3]);
        FinArray.addObject("4");
        System.out.println(FinArray.array[3]);
        System.out.println(FinArray.array[4]);
        //System.out.println(main.array[6]);
    }
}
