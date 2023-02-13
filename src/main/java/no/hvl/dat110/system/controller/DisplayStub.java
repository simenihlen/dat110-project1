package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

import java.io.IOException;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) throws IOException {
		
		// TODO - START
		
		// implement marshalling, call and unmarshalling for write RPC method
		
		byte[] marshalling = RPCUtils.marshallString(message);
		byte[] response = rpcclient.call((byte)Common.WRITE_RPCID, marshalling);
		RPCUtils.unmarshallString(response);
		
		// TODO - END
		
	}
}
