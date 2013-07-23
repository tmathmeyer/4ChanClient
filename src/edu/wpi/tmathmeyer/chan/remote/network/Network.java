package edu.wpi.tmathmeyer.chan.remote.network;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Network {
	
	private static String userAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2";
	
	
	
	
	
	public static void setNewUserAgent(String userAgent) {
		Network.userAgent = userAgent;
	}
	
	public static InputStream getHtmlBuffer(String u) throws IOException{
	    URL url = new URL(u);
	    java.net.URLConnection c = url.openConnection();
	    c.setRequestProperty("User-Agent", Network.userAgent);
	    return c.getInputStream();
	}
	
	public static byte[] getImage(InputStream imageStream) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1!=(n=imageStream.read(buf)))
		   out.write(buf, 0, n);
		out.close();
		imageStream.close();
		return out.toByteArray();
	}
	
	public static String getPageAsText(InputStream pageStream) throws IOException {
		DataInputStream dataIn = new DataInputStream(new BufferedInputStream(pageStream));
		return dataIn.readLine();
	}
	
	public static char bytesToChar(byte b1, byte b2) {
		return (char) ((b1 << 8) | (b2 & 0xFF));
	}
	
	public static byte[] charToBytes(char c) {
		byte[] result = new byte[2];
		result[0] = (byte)c;
		result[1] = (byte)(c >> 8);
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(getPageAsText(getHtmlBuffer("http://api.4chan.org/wg/res/5435196.json")));
	}
}
