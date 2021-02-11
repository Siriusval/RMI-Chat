package tp.rmi.common;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatRemote extends Remote {

	String echo(String name, String message) throws RemoteException;

	void send(String name, String message) throws RemoteException, MalformedURLException, NotBoundException;

	void registerCallback(ReceiveCallback callback) throws RemoteException;
}