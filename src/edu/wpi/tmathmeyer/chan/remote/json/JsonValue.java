package edu.wpi.tmathmeyer.chan.remote.json;

public class JsonValue {
	
	public JsonValue parse(char[] Json, I i) {
		JsonValue co = null;
		
		while(i.i < Json.length) {
			while (Json[i.i] == ' ' || Json[i.i] == ',' || Json[i.i] == ':') {
				i.p();
			}
			
			if (Json[i.i] == '{') {
				co = new JsonObject();
				i.p();
				JsonString key;
				while((key = (JsonString) parse(Json, i)) != null) {
					JsonValue val = parse(Json, i);
					((JsonObject)co).add(key, val);
				}
				return co;
			}
			else if (Json[i.i] == '[') {
				co = new JsonArray();
				i.p();
				JsonValue key;
				while((key = parse(Json, i)) != null) {
					((JsonArray)co).add(key);
				}
				return co;
			}
			else if (Json[i.i] == 'n' || Json[i.i] == 'N') {
				co = new JsonNull();
				i.p(4);
				return co;
			}
			else if (Json[i.i] == 't' || Json[i.i] == 'T') {
				co = new JsonBoolean(true);
				i.p(4);
				return co;
			}
			else if (Json[i.i] == 'f' || Json[i.i] == 'F') {
				co = new JsonBoolean(false);
				i.p(5);
				return co;
			}
			else if (Json[i.i] == '"') {
				StringBuilder sb = new StringBuilder();
				i.p();
				while(Json[i.i] != '"') {
					if (Json[i.i] == '\\') {
						sb.append(Json[i.i+1]);
						i.p(2);
					}
					else {
						sb.append(Json[i.i]);
						i.p();
					}
				}
				i.p();
				return new JsonString(sb.toString());
			}
			else if (Json[i.i] == ']') {
				i.p();
				return co;
			}
			else if (Json[i.i] == '}') {
				i.p();
				return co;
			}
			else if (isNumber(Json[i.i])) {
				StringBuilder sb = new StringBuilder();
				while(isNumber(Json[i.i])){
					sb.append(Json[i.i]);
					i.p();
				}
				return new JsonNumber(sb.toString());
			}
			
			i.p();
			
		}
		
		return new JsonNull();
	}
	
	boolean isNumber(char c){
		return c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0';
	}
	
	public JsonValue get(String s) throws JsonException{
		throw new JsonException("this is not an object");
	}
	
	public JsonValue get(JsonString s) throws JsonException{
		throw new JsonException("this is not an object");
	}
	
	public JsonValue get(int i) throws JsonException {
		throw new JsonException("this is not an array");
	}
	
	public String getType() {
		return "JsonValue"; 
	}
}

class I {
	int i = 0;
	void p(){i++;}
	void p(int i){this.i+=i;}
}