import java.rmi.Naming;

public class qn32Client {

    public static void main(String[] args) {
        try {
            // Lookup the remote object from the RMI registry
            qn32Adder stub = (qn32Adder) Naming.lookup("rmi://localhost:5000/AdderService"); 
            // Specify the RMI registry port

            System.out.println("Result: " + stub.addNumbers(6, 9));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
