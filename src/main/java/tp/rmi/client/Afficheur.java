package tp.rmi.client;

import tp.rmi.common.ChatRemote;
import tp.rmi.common.ReceiveCallback;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Afficheur  extends UnicastRemoteObject implements ReceiveCallback {


    protected Afficheur() throws RemoteException {
        super();
    }

    @Override
    public void newMessage(String message) throws RemoteException {
        System.out.println(message);
    }
}
