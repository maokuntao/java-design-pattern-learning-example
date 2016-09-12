package com.java.designpattern.proxy.gumballrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 *
 * @author taomk
 * 2016年9月9日 上午10:51:04
 */
public interface GumballMachineRemote extends Remote {

	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
