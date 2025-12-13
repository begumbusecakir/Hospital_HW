package TreatmentRequest;

public class MainTreatmentQueue {
    public static void main(String args[]){
        TreatmentQueue Tqueue = new TreatmentQueue();

        // Add
        Tqueue.enqueue(new TreatmentRequest(1));
        Tqueue.enqueue(new TreatmentRequest(2));
        Tqueue.enqueue(new TreatmentRequest(3));
        Tqueue.enqueue(new TreatmentRequest(4));
        Tqueue.enqueue(new TreatmentRequest(5));
        Tqueue.enqueue(new TreatmentRequest(6));
        Tqueue.enqueue(new TreatmentRequest(7));
        Tqueue.enqueue(new TreatmentRequest(8));

        // delete
        Tqueue.dequeue();
        Tqueue.dequeue();
        Tqueue.dequeue();


        // Print queue size
        System.out.println("Queue size: " + Tqueue.size());

        //print
        System.out.println("Remaining treatment requests:");
        Tqueue.printQueue();


    }
}
