import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    public HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello(String name) throws RemoteException {
        System.out.println("Serving " + name + " on " + Thread.currentThread().getName());
        return "Hello, " + name + "!";
    }
}