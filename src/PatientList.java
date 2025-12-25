public class PatientList {
    Node head;

    public void addPatient(Patient p) {
        Node newNode = new Node(p);
        if (head == null) {
            head = newNode;
            return;
        }
        Node trvl = head;
        while (trvl.next != null) {
            trvl = trvl.next;
        }
        trvl.next = newNode;

    }

    public void removePatient(int id) {

        if (head == null) {
            return;
        }
        //case1
        if (head.data.id == id) {
            head = head.next;
            return;
        }
        //case2
        Node trvl = head;
        while (trvl.next != null) {
            if (trvl.next.data.id == id) {
                trvl.next = trvl.next.next;
                return;
            }
            trvl = trvl.next;
        }
    }

    public Patient findPatient(int id) {
        if (head == null) {
            return null;
        }
        Node trvl = head;
        while (trvl.next != null) {
            if (trvl.data.id == id) {
                return trvl.data;
            }
            trvl = trvl.next;
        }

        return null;
    }

    public void printList() {
        Node trvl = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (trvl != null) {
            System.out.println(trvl.data.id + "");
            trvl = trvl.next;
        }

        System.out.println();
    }

}






