package example.cours;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		DateRemote date = (DateRemote) Naming.lookup("//localhost/date");
		System.out.println(date.getServerDate());
		System.out.println(date.getCalls());
	}
}