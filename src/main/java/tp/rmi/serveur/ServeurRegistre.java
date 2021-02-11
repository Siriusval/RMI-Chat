package tp.rmi.serveur;

import tp.rmi.common.ChatRemote;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRegistre {

    public static void main(String[] args) throws RemoteException {
        ChatRemote chatRemote = new ChatRemoteImpl();
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.rebind("chat", chatRemote);
        System.out.println(chatRemote + " has been registered");
    }
}