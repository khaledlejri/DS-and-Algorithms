package lists;

public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
        public int size(){
            if (next == null){
                return 1;
            } else {
                return 1 + next.size();
            }
        }
    }

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
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
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        if (first == null) {
            return 0;
        } else {
            return first.size();
        }
    }


    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(15);
        L.addFirst(20);
        System.out.println(L.getFirst());
        L.addLast(434);
        System.out.println("Size of SLList is: " + L.size());
    }
}
