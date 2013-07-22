package edu.wpi.tmathmeyer.chan.remote.json;

public class JsonNull extends JsonValue{
	public String toString(){
		return "NULL";
	}
	
	public String getType() {
		return "JsonNull"; 
	}
}
