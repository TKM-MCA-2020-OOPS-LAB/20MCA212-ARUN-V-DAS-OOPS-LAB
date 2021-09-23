package myprjct;

import java.io.*;
import java.net.*;
import java.util.*;

public class udpclient {
	

		public static void main(String[] args) throws SocketException, IOException {
			// TODO Auto-generated method stub
			InetAddress IP = InetAddress.getByName("localhost");
			DatagramSocket csocket = new DatagramSocket();
			
			while(true) {
				byte[] sendbuffer = new byte[1024];
				byte[] receivebuffer = new byte[1024];
				System.out.println("\n\nCLIENT: ");
				Scanner sc = new Scanner(System.in);
				String clientData = sc.nextLine();
				sendbuffer = clientData.getBytes();
				
				DatagramPacket sndpkt = new DatagramPacket(sendbuffer, sendbuffer.length, IP, 4242);
				csocket.send(sndpkt);;
				
				if(clientData.equalsIgnoreCase("Bye")) {
					System.out.println("***Connection dropped by Client***");
					break;
				}
				
				DatagramPacket rcvpkt = new DatagramPacket(receivebuffer, receivebuffer.length);
				csocket.receive(rcvpkt);
				String serverData = new String(rcvpkt.getData());
				System.out.print("\nSERVER: "+ serverData);
				
			}
			
			csocket.close();

		}

	}