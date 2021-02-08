package example.cours;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServeurTemps {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		DateRemote objetDistant = new DateRemoteImpl();
		Naming.rebind("//localhost/date", objetDistant);
		System.out.println(objetDistant + " has been registered");
	}
}