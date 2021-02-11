package tp.rmi.common;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;

import java.rmi.RemoteException;

public interface ReceiveCallback extends Remote {

	void newMessage(String message) throws RemoteException, MalformedURLException, NotBoundException;

}