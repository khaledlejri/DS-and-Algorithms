package lists;

public class AList {
    private int size;
    private int[] items;
    /** creates an empty list */
    public AList(){
        items = new int[100];
        size = 0;
    }
    /** Resizes the underlying array to the target capacity */
    private void resizeArray(int capacity){
            int[] biggerArray = new int[capacity];
            System.arraycopy(items, 0, biggerArray, 0, size);
            biggerArray[size] = x;
            items = biggerArray;
    }

    public void addLast(int x){
        if(size == items.length) {
            resizeArray(2 * size);
        }
        items[size] = x;
        size += 1;
    }

    public int getLast(){
        return items[size - 1];
    }

    /** gets the ith item in the list ( 0 is the front) */
    public int get(int i) {
        return items[i];
    }

    public int size(){
        return size;
    }
    public int removeLast(){
        int x = getLast();
        size -= 1;
        return x;
    }
}
