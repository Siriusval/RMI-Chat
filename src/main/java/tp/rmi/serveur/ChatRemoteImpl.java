package tp.rmi.serveur;

import tp.rmi.common.ChatRemote;
import tp.rmi.common.ReceiveCallback;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChatRemoteImpl extends UnicastRemoteObject implements ChatRemote {

    private final ArrayList<ReceiveCallback> callbackList;
    private static final long serialVersionUID = 1L;

    protected ChatRemoteImpl() throws RemoteException {
        super();
        callbackList= new ArrayList<>();
    }

    @Override
    public String echo(String name, String message) throws RemoteException {
        return String.format("%s>%s%n",name,message);
    }

    @Override
    public void send(String name, String message) throws RemoteException, MalformedURLException, NotBoundException {
        for(ReceiveCallback callback : callbackList){
            callback.newMessage(echo(name,message));
        }
    }

    @Override
    public void registerCallback(ReceiveCallback callback) throws RemoteException {
        this.callbackList.add(callback);
    }
}
