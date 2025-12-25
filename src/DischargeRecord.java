public class DischargeRecord {
    //discharged patient
    int patientId;

    //timestamp
    long dischargeDate;

    //constructor
    public DischargeRecord(int patientId,long dischargeTime){
        this.patientId=patientId;
        this.dischargeDate=dischargeTime;
    }
    public String toString(){
        return "DischargeRecord{ "+"patientId="+patientId+",dischargeTime="
                +
                dischargeDate +'}';
    }

}
