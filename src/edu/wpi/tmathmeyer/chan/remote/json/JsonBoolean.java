package edu.wpi.tmathmeyer.chan.remote.json;

public class JsonBoolean extends JsonValue{
	private boolean b;
	
	public boolean value() {
		return b;
	}
	
	public JsonBoolean(boolean b) {
		this.b = b;
	}
	
	public String toString() {
		return b ? "TRUE" : "FALSE";
	}
	
	public String getType() {
		return "JsonBoolean"; 
	}
}
