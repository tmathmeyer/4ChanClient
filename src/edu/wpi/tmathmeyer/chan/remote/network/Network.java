package edu.wpi.tmathmeyer.chan.remote.network;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 
 * @author Ted
 *
 */
public class Network {
	
	private static String userAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2";
	
	
	
	
	/**
	 * 
	 * @param userAgent sets a new useragent (default as mac OS X 10.4 running firefox)
	 */
	public static void setNewUserAgent(String userAgent) {
		Network.userAgent = userAgent;
	}
	
	/**
	 * 
	 * @param u the url of the source
	 * @return an output stream from the input source capable of reading data, and mimicking the given user agent
	 * @throws IOException if there is an error with the URL or UserAgent, an exception is thrown
	 */
	public static InputStream getHtmlBuffer(String u) throws IOException{
	    URL url = new URL(u);
	    java.net.URLConnection c = url.openConnection();
	    c.setRequestProperty("User-Agent", Network.userAgent);
	    return c.getInputStream();
	}
	
	/**
	 * 
	 * @param imageStream the input stream from which the image data is read
	 * @return the image, as a byte array
	 * @throws IOException if there is no data on the recieving end
	 */
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
	
	/**
	 * 
	 * @param pageStream the input stream from which the page JSON file is read
	 * @return a string JSON of the page content
	 * @throws IOException if there is no dara on the recieving end
	 */
	public static String getPageAsText(InputStream pageStream) throws IOException {
		DataInputStream dataIn = new DataInputStream(new BufferedInputStream(pageStream));
		return dataIn.readLine();
	}
	
	/**
	 * converts two bytes into a single character
	 * @param b1 the first (most significant) byte
	 * @param b2 the second (least significant) byte
	 * @return the 16 bit form of the two input 8 bit values
	 */
	public static char bytesToChar(byte b1, byte b2) {
		return (char) ((b1 << 8) | (b2 & 0xFF));
	}
	
	/**
	 * 
	 * @param c the character to convert to bytes
	 * @return an pair of bytes, where the first value is the least significant, and the second is the most significant
	 */
	public static byte[] charToBytes(char c) {
		byte[] result = new byte[2];
		result[0] = (byte)c;
		result[1] = (byte)(c >> 8);
		return result;
	}
}
