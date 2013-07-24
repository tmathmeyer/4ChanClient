package edu.wpi.tmathmeyer.chan.io;
import edu.wpi.tmathmeyer.chan.remote.json.*;
import java.util.List;
import java.io.BufferedWriter;

/*
 * Joe Jevnik July 22 2013
 */
public class Save {
    String title;
    String description;
    List<String> meta;
    JsonValue value;
    FilePath directory;
    
    /**
     * @brief Private constructor, use SaveBuilder instead.
     */
    private Save(){}

    public void toFile(){
	