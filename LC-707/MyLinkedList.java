class MyLinkedList {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node node = getNodeAtIndex(index);
        return node.value;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
        } else {
            Node prevTail = getNodeAtIndex(size - 1);
            prevTail.next = newNode;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index >=0 && index <= size) {
            Node newNode = new Node(val);
            if (index == 0) {
                Node prevHead = head;
                newNode.next = prevHead;
                head = newNode;
            } else {
                if (index < size) {
                    Node nodeAtIndex = getNodeAtIndex(index);
                    newNode.next = nodeAtIndex;
                }
                Node nodeAtPrevIndex = getNodeAtIndex(index - 1);
                nodeAtPrevIndex.next = newNode;
            }
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >=0 && index < size) {
            Node nodeAtNextIndex = getNodeAtIndex(index + 1);
            if (index == 0) {
                head = nodeAtNextIndex;
            } else {
                Node nodeAtPrevIndex = getNodeAtIndex(index - 1);
                nodeAtPrevIndex.next = nodeAtNextIndex;
            }
            size--;
        }
    }

    private Node getNodeAtIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
