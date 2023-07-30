import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class qn32Server {

    public static void main(String[] args) {
        try {
            qn32Adder stub = new qn32AdderImpl();
            LocateRegistry.createRegistry(5000); // Specify the RMI registry port
            Naming.rebind("rmi://localhost:5000/AdderService", stub); // Use the same name in the client

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
