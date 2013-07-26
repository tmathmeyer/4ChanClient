/*******************************************************************************
 * author: Ted Meyer
 * since: july, 2013
 *******************************************************************************/
package edu.wpi.tmathmeyer.chan.io;

public class FilePath{
    public enum OS_TYPE{
        WINDOWS, UNIX;
    }
    private String win_path = "%AppData%4cc/";
    private String unx_path = "~/.4cc/";
    
    private static FilePath instance;
    
    private FilePath(){}

    /**
     * 
     * This is the proper way to create a singleton instance class.
     * By definition, there should be nothing but a null private instance
     * variable and a static getInstance method. On call of the method
     * a new instance will be created provided there was not one before.
     * This limits the number of copies of this object to at max 1 at any
     * time, while still making sure that there is no memory allocated 
     * before it is needed.
     * 
     * @return a new instance of the filePath class. 
     */
    public static FilePath getInstance(){  
        if (instance == null) {
            instance = new FilePath();
        }
        return instance;
    }
    
    public String getPath(OS_TYPE type) {
        if (type == OS_TYPE.WINDOWS) {
            return this.win_path;
        }
        else if (type == OS_TYPE.UNIX) {
            return this.unx_path;
        }
        else {
            throw new RuntimeException(); //something has gone terribly, terribly wrong
        }
    }
}