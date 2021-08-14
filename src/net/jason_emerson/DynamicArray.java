package net.jason_emerson;





public class DynamicArray {

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[2];
        size = 2;
        count = 0;
    }

    public void add(int num) {
        if(count == size) increaseSize();
        array[count] = num;
        count++;
    }

    public void addAt(int index, int num) {
        if(count == size) increaseSize();
        for(int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = num;
        count++;
    }

    public void remove() {
        if(count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    public void removeAt(int index) {
        if(count > 0) {
            for(int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = 0;
            count--;
        }
    }

    public void increaseSize() {
        int[] temp = new int[size * 2];
        for(int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = size * 2;
    }

    public void decreaseSize() {
        int[] temp = null;
        if(count > 0) {
            temp = new int[count];
            for(int i = 0; i < count; i++) {
                temp[i] = array[i];
            }
            size = count;
            array = temp;
        }
    }

    public int size() {
        return size;
    }

    public int count() {
        return count;
    }

    public int[] getArray() {
        return array;
    }
}
