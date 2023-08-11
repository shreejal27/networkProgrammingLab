import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class qn32Server {

    public static void main(String[] args) {
        try {
            qn32Adder stub = new qn32AdderImpl();
            LocateRegistry.createRegistry(1098); 
            Naming.rebind("rmi://localhost:1098/AdderService", stub); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
