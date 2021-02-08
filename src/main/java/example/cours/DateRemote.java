package example.cours;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date; //Date est Serializable

public interface DateRemote extends Remote {
	public Date getServerDate() throws RemoteException;

	public int getCalls() throws RemoteException;
}