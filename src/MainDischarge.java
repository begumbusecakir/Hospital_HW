public class MainDischarge {
    public static void main(String args[]){
        DischargeStack stack=new DischargeStack();
        //add 5 leaved

        stack.push(new DischargeRecord(23044510, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230444078, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230444078, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230444078, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230444078, System.currentTimeMillis()));

//  (pop )
        System.out.println("Processing dis charged patients");
        stack.pop();
        stack.pop();


        System.out.println("\nRemaining discharge records:");
        stack.printStack();

    }
}
