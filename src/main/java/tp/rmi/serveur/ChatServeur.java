package tp.rmi.serveur;

import tp.rmi.common.ChatRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ChatServeur {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        ChatRemote objetDistant = new ChatRemoteImpl();
        Naming.rebind("//localhost/chat", objetDistant);
        System.out.println(objetDistant + " has been registered");
        /*
         //On veut le rmiregistry sur la machine localhost avec le port par défaut
        Registry registry = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT);
        registry.rebind("//localhost/date", d);
        System.out.println(d + " has been registered");
         */

    }

}
