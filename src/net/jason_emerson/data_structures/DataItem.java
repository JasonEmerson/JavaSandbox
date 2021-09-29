package net.jason_emerson.data_structures;

public class DataItem {
    //excluding arbitrary extra data or object references
    //only implementing data(key) for clarity
    private int key;

    public DataItem(int i) {
        key = i;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(key));
    }


}
