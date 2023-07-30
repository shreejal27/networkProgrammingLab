// Write a RMI program to add numbers.
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface qn32Adder extends Remote {
    int addNumbers(int a, int b) throws RemoteException;
}
