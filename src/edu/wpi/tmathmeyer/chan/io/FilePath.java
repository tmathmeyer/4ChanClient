package edu.wpi.tmathmeyer.chan.io;

public static FilePath{
    String path;
    
    private FilePath(){
    path = "~/chanapp/";
    }

    public FilePath getInstance(){    
    return (path = null) ? new FilePath() : this;
    }