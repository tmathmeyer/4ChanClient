package edu.wpi.tmathmeyer.chan.remote.json;

public class JsonNumber extends JsonValue{
	
	private String v;
	
	public JsonNumber(String v) {
		this.v = v;
	}
	
	public String toString() {
		return v;
	}
	
	public String getType() {
		return "JsonNumber"; 
	}
}
