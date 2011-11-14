package org.my;
import java.io.DataInputStream;

class AppMain3
{
    public static void main(String[] args)
    {
        try {
	    DataInputStream in = new DataInputStream(System.in);
	    String next = in.readLine();
	    while (next != null && next.length() > 0 && !next.contains("end")) {
		final String arg = next;
		Thread thread = new Thread(arg) {
			public void run() {
			    System.out.println(arg);
			}
		    };
		thread.start();
		try {
		    thread.join();
		} catch (Exception e){
		}
		next = in.readLine();
	    }
	} catch (Exception e) {
	}
    }
}
