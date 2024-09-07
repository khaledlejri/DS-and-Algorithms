package lists;

public class AList<Item> {
    private int size;
    private Item[] items;
    /** creates an empty list */
    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }
    /** Resizes the underlying array to the target capacity */
    private void resizeArray(int capacity){
            Item[] biggerArray = (Item[]) new Object[capacity];
            System.arraycopy(items, 0, biggerArray, 0, size);
            biggerArray[size] = x;
            items = biggerArray;
    }

    public void addLast(Item x){
        if(size == items.length) {
            resizeArray(2 * size);
        }
        items[size] = x;
        size += 1;
    }

    public Item getLast(){
        return items[size - 1];
    }

    /** gets the ith item in the list ( 0 is the front) */
    public Item get(Item i) {
        return items[i];
    }

    public int size(){
        return size;
    }
    public Item removeLast(){
        Item x = getLast();
        size -= 1;
        return x;
    }
}
