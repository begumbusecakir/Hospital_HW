//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        PatientList line=new PatientList();
        line.addPatient(new Patient(23456,"birce",2,20));
        line.addPatient(new Patient(23442,"ceren",3,21));
        line.addPatient(new Patient(28456,"arda",6,23));
        line.addPatient(new Patient(34567,"daniel",5,23));
        line.addPatient(new Patient(34568,"dani",6,23));

        System.out.println("Line");
        line.printList();
        line.removePatient(34567);
        line.findPatient(34568);
       line.printList();
        }
    }
