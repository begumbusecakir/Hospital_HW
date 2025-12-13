package TreatmentRequest;
/*This class tracks a patient's traetment process.
 It doesn't perform any operations.It only stores data.Treatment is manged with queue.*/

public class TreatmentRequest {
    //Stores the patient ID and the arrival time.
    private int patientId;
    private long arrivalTime;

    public TreatmentRequest(int patientId){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();

    }
    //Returns the patient ID.
    public int getPatientId() {
        return patientId;
    }
    //Returns the arrival time.
    public long getArrivalTime() {
        return arrivalTime;

    }
    //Used to print the object in a readable format on the console.
    @Override
    public String toString(){
        return "Patient ID:" + patientId + "Arrival Time:" + arrivalTime;
    }
}
