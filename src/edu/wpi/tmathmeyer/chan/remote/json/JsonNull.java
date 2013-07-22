package edu.wpi.tmathmeyer.chan.remote.json;

public class JsonNull extends JsonValue{
	/**
	 *  the empty constructor for the JSON Null wrapper class
	 */
	public String toString(){
		return "NULL";
	}
	
	@Override
	public String getType() {
		return "JsonNull"; 
	}
	
	@Override
	public boolean equals(Object o) {
		return o instanceof JsonNull;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
}
