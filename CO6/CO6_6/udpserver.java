package myprjct;

import java.io.*;
import java.net.*;
import java.util.*;

public class udpserver {

	public static void main(String[] args) throws SocketException, IOException {
		DatagramSocket sSocket = new DatagramSocket(4242);
		
		while(true) {
			byte[] sendbuffer = new byte[1024];
			byte[] receivebuffer = new byte[1024];
			DatagramPacket rcvdpkt = new DatagramPacket(receivebuffer, receivebuffer.length);
			sSocket.receive(rcvdpkt);
			InetAddress IP = rcvdpkt.getAddress();
			int portNo = rcvdpkt.getPort();
			String clData = new String(rcvdpkt.getData());
			System.out.println("\nCLIENT: " + clData);
			System.out.println("\nSERVER: ");
			Scanner sc = new Scanner(System.in);
			String serData = sc.nextLine();
			sendbuffer = serData.getBytes();
			DatagramPacket sendpkt = new DatagramPacket(sendbuffer, sendbuffer.length, IP, portNo);
			sSocket.send(sendpkt);
			
			if(serData.equalsIgnoreCase("Bye")) {
				System.out.println("***Connection dropped by Server***");
				break;
				
			}
			
		}
		sSocket.close();
	}
}
