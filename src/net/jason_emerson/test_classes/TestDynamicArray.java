package net.jason_emerson.test_classes;
import net.jason_emerson.dailies.DynamicArrayDaily;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArrayDaily arrayList = new DynamicArrayDaily();

        arrayList.insert(10);
        arrayList.printArray();
        arrayList.insert(20);
        arrayList.printArray();
        arrayList.insert(30);
        arrayList.printArray();
        arrayList.insert(40);
        arrayList.printArray();
        arrayList.insert(50);
        arrayList.printArray();

        arrayList.deleteAt(0);
        arrayList.printArray();
        arrayList.deleteAt(1);
        arrayList.printArray();
        arrayList.deleteAt(2);
        arrayList.printArray();

        arrayList.insertAt(0, 42);
        arrayList.printArray();

        arrayList.delete();
        arrayList.printArray();
        arrayList.delete();
        arrayList.printArray();
        arrayList.delete();
        arrayList.printArray();
        arrayList.delete();
        arrayList.printArray();
    }
}
