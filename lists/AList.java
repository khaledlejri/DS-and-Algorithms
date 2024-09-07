package lists;

public class AList {
    private int size;
    private int[] items;
    /** creates an empty list */
    public AList(){
        items = new int[100];
        size = 0;
    }

    public void addLast(int x){
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
