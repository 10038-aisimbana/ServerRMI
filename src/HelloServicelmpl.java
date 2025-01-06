import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServicelmpl extends UnicastRemoteObject implements IHelloService {
    public HelloServicelmpl() throws RemoteException {
        super();
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name;
    }

}
