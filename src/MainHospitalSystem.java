public class MainHospitalSystem {
    public static void main(String[] args) {
    HospitalSystem line4 = new HospitalSystem();


    //adding patients
        line4.addPatient(new Patient(1,"Begüm",5,21));
        line4.addPatient(new Patient(2,"Buse",2,22));
        line4.addPatient(new Patient(3,"Zümra",1,18));
        line4.addPatient(new Patient(4,"Birce",4,20));
        line4.addPatient(new Patient(5,"Ceren",6,22));
        line4.addPatient(new Patient(6,"Ayşenur",9,21));
        line4.addPatient(new Patient(7,"Mustafa",4,21));
        line4.addPatient(new Patient(8,"Arda",3,21));
        line4.addPatient(new Patient(9,"Çağatay",8,21));
        line4.addPatient(new Patient(10,"Sena",7,21));


    //adding normal
        line4.addTreatmentRequest(2,false);
        line4.addTreatmentRequest(4,false);
        line4.addTreatmentRequest(7,false);
        line4.addTreatmentRequest(9,false);
        line4.addTreatmentRequest(10,false);


    //adding priority
        line4.addTreatmentRequest(1,true);
        line4.addTreatmentRequest(6,true);
        line4.addTreatmentRequest(3,true);


    //adding discharge
        line4.addDischargeRecord(5);
        line4.addDischargeRecord(8);


    //process treatment
        line4.processTreatmentRequest();
        line4.processTreatmentRequest();


    //sorting by severity
        line4.sortPatientsBySeverityDesc();


    //print final state
        line4.printSystemState();
}
}
