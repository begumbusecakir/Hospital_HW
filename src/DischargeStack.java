public class DischargeStack {
    //Node for stack
    private class Node {
        //Nodes have dischargerecord
        DischargeRecord data;
        Node next;


        //Node constructor
        public Node(DischargeRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    //show top
    private Node top;


    //empty
    public DischargeStack() {
        top = null;
    }
    //new discharged patient to stack(push)

    public void push(DischargeRecord record) {
        Node newNode = new Node(record);


        newNode.next = top;
        //new node is top

        top = newNode;
    }

    public DischargeRecord pop() {
//empty
        if (top == null) {
            return null;
        }
        DischargeRecord removedRecord = top.data;
        top = top.next;
        return removedRecord;

    }

    //peek
    public DischargeRecord peek() {

        //empty
        if (top == null) {
            return null;
        }
        return top.data;
    }

    //all leaved patient
    public void printStack() {
        Node current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}