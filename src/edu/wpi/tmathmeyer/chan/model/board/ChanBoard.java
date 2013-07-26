/*******************************************************************************
 * author: Ted Meyer
 * since: july, 2013
 *******************************************************************************/
package edu.wpi.tmathmeyer.chan.model.board;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.thread.ChanThread;

public class ChanBoard {
    
    public enum BoardName {
        RANDOM("b"), ANIME("a"), WALLPAPER_GENERAL("wg");
        
        private final String shortName;
        BoardName(String sn) {
            this.shortName = sn;
        }
        public String getShortName() {
            return this.shortName;
        }
    }
    
    
    private BoardName name;
    private List<ChanThread> threads;
    
    /**
     * @return the name
     */
    public BoardName getName() {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(BoardName name) {
        this.name = name;
    }

    /**
     * @return the threads
     */
    public List<ChanThread> getThreads() {
        return threads;
    }

    /**
     * @param threads the threads to set
     */
    public void setThreads(List<ChanThread> threads) {
        this.threads = threads;
    }
    
    /**
     * 
     * @param thread the threads to add
     */
    public void addThread(ChanThread thread) {
        this.threads.add(thread);
    }
    
    /**
     * 
     * @return the number of active threads on this board
     */
    public int getThreadCount() {
        return this.threads.size();
    }
}
