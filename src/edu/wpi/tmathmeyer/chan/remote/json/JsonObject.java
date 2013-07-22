package edu.wpi.tmathmeyer.chan.remote.json;

import java.util.HashMap;
import java.util.Map.Entry;

public class JsonObject extends JsonValue{
	private HashMap<JsonString, JsonValue> values = new HashMap<JsonString, JsonValue>();
	
	public JsonValue get(JsonString js) {
		JsonValue r = values.get(js);
		if (r==null) return new JsonNull();
		return r;
	}
	
	public void add(JsonString js, JsonValue jv) {
		this.values.put(js, jv);
	}
	
	public JsonValue get(String s) {
		return this.get(new JsonString(s));
	}
	
	public String toString() {
		StringBuilder r = new StringBuilder();
		r.append("{");
		int c = 0;
		for (Entry<JsonString, JsonValue> entry : values.entrySet()) {
			if (c!=0) r.append(",");
		    JsonString key = entry.getKey();
		    JsonValue value = entry.getValue();
		    r.append(key.toString()+":"+value.toString());
		    c++;
		}
		r.append("}");
		return r.toString();
	}
	
	public String getType() {
		return "JsonObject"; 
	}
	
	public JsonArray keyList() {
		JsonArray jr = new JsonArray();
		for (Entry<JsonString, JsonValue> entry : values.entrySet()) {
		    JsonString key = entry.getKey();
		    jr.add(key);
		}
		return jr;
	}
}
