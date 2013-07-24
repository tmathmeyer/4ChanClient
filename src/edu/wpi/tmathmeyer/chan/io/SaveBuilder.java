package edu.wpi.tmathmeyer.chan.io;
import edu.wpi.tmathmeyer.chan.remote.json.*;
import java.util.List;

/*
 * Joe Jevnik July 22 2013
 */
public class SaveBuilder {
    String title;
    String description;
    List<String> meta;
    JsonValue content;
    
    /**
     * @return The Save built form the SaveBuilder's options.
     */
    public Save build(){
	return new Save(title,description,meta,content);
    }
    
    /**
     * @param The title of the Save.
     */
    public void setTitle(String title){
	this.title = title;
    }

    /**
     * @param The desctiption of the Save.
     */
    public void setDescription(String description){
	this.description = description;
    }
    
    /**
     * @param A String to add to the metadata of the Save.
     */
    public void addMeta(String data){
	this.meta.add(data);
    }

    /**
     * @param The JsonValue of the Save.
     */
    public void setContent(JsonValue Content){
	this.content = content;
    }
}