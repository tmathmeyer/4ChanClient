package edu.wpi.tmathmeyer.chan.remote.json;

import java.util.HashMap;
import java.util.Map.Entry;

public class JsonObject extends JsonValue{
    private HashMap<JsonString, JsonValue> values = new HashMap<JsonString, JsonValue>();
    
    @Override
    public JsonValue get(JsonString js) {
        JsonValue r = values.get(js);
        if (r==null) return new JsonNull();
        return r;
    }
    
    /**
     * 
     * @param js the JsonString to be used as the key in this pair.
     * @param jv the JsonValue to be set as the object in this pair.
     */
    public void add(JsonString js, JsonValue jv) {
        this.values.put(js, jv);
    }
    
    @Override
    public JsonValue get(String s) {
        return this.get(new JsonString(s));
    }
    
    @Override
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
    
    @Override
    public String getType() {
        return "JsonObject"; 
    }
    
    /**
     * 
     * @return as list of keys in properly formatted JSON.
     */
    public JsonArray keyList() {
        JsonArray jr = new JsonArray();
        for (Entry<JsonString, JsonValue> entry : values.entrySet()) {
            JsonString key = entry.getKey();
            jr.add(key);
        }
        return jr;
    }
    
    @Override
    public int hashCode() {
        return values.hashCode();
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof JsonObject) {
            return this.values.equals(((JsonObject)o).values);
        }
        return false;
    }
}
