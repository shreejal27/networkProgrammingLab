import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class qn32AdderImpl extends UnicastRemoteObject implements qn32Adder {

    public qn32AdderImpl() throws RemoteException {
        super();
    }

    public int addNumbers(int a, int b) throws RemoteException {
        return a + b;
    }
}
