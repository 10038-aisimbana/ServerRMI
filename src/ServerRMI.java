import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class  ServerRMI {
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(1099);

            IHelloService helloService = new HelloServicelmpl();

            Naming.rebind("Hello", helloService);

            System.out.println("El servidor esta listo");
        }catch(MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }

}
