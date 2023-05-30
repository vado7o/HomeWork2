public class LinkedList {
    int size;
    Node head;

    public void Add(int _value) {
        Node newNode = new Node();
        newNode.value = _value;
        newNode.next = null;
        newNode.prev = null;
        if (head == null)
            head = newNode;
        else {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        size++;
    }

    public void Add(int... arguments) {
        for (int i = 0; i < arguments.length; i++)
            this.Add(arguments[i]);
    }

    public void Print() {
        if (head != null) {
            System.out.print("[ ");
            Node currentNode = head;
            while (currentNode.next != null) {
                System.out.print(currentNode.value + ", ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.value + " ]");
        }
    }

    public void Reverse() {
        if (head == null || head.next == null) {
            System.out.print("ЛИСТ ПУСТОЙ!");
        }
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}

