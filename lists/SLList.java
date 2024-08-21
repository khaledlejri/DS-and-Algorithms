package lists;

public class SLList {
    private IntNode first; //this is accessed only in SLList file
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /**
     * this nested class does not need to access any of the members
     * of the enclosing class SLList
     * so we add the keyword static
     */
    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
        /*public int size(){
            if (next == null){
                return 1;
            } else {
                return 1 + next.size();
            }
        }*/
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        IntNode p = this.first;
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    /**
     * The recursive call for size in IntList was straightforward:
     * return 1 + this.rest.size().
     * For a SLList, this approach does not make sense.
     * A SLList has no rest variable. Instead, we'll use a common pattern that is
     * used with middleman classes like SLList -- we'll create a private helper method
     * that interacts with the underlying naked recursive data structure.
     * @param p
     * @return
     */
    private static int size(IntNode p){
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }
    /** Returns the number of items in the list using recursion. */
    public int size() {
        return size(first);
        /*if (first == null) {
            return 0;
        } else {
            return first.size();
        }*/
    }


    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(15);
        L.addFirst(20);
        System.out.println(L.getFirst());
        L.addLast(434);
        System.out.println("Size of SLList is: " + L.size());
        System.out.println("Size using caching gives:" + L.size);
    }
}
