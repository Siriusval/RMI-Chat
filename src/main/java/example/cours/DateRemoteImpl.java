package example.cours;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class DateRemoteImpl extends UnicastRemoteObject implements DateRemote {

	private static final long serialVersionUID = 1L;

	private int calls = 0;

	protected DateRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public Date getServerDate() throws RemoteException {
		calls++;
		return new Date();
	}

	@Override
	public int getCalls() throws RemoteException {
		return calls;
	}
}