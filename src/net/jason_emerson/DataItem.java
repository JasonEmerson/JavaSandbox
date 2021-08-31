package net.jason_emerson;

public class DataItem {
    //excluding arbitrary extra data or object references
    //only implementing data(key) for clarity
    private int data;

    public DataItem(int i) {
        data = i;
    }

    public int getKey() {
        return data;
    }
}
