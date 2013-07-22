package edu.wpi.tmathmeyer.chan.remote.json;

public class JsonString extends JsonValue{
	
	private String s;

	public JsonString(String s) {
		this.s = s;
	}

	public String toString() {
		return this.value();
	}
	
	public String value() {
		return "\""+this.s+"\"";
	}
	
	public String getType() {
		return "JsonString"; 
	}
	
	public int hashCode() {
		return s.hashCode();
	}
	
	public boolean equals(Object o) {
		if (o instanceof JsonString) {
			return ((JsonString)o).s.equals(s);
		}
		return false;
	}
}
