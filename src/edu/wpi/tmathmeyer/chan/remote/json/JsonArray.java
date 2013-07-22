package edu.wpi.tmathmeyer.chan.remote.json;

import java.util.ArrayList;

public class JsonArray extends JsonValue{
	private ArrayList<JsonValue> values = new ArrayList<JsonValue>();
	
	public JsonValue get(int i) {
		return values.get(i);
	}
	
	public void add(JsonValue jv) {
		this.values.add(jv);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[");
		for(int i = 0; i < values.size() ; i++) {
			JsonValue jv = values.get(i);
			if (i > 0) result.append(",");
			result.append(jv.toString());
		}
		result.append("]");
		return result.toString();
	}
	
	public String getType() {
		return "JsonArray"; 
	}
}
