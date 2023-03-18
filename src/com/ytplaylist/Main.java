package com.ytplaylist;

import java.util.LinkedList;
/**
 * 
 * @author Rahul Shanbhag
 *
 */

public class Main {
	
    public static void main(String[] args) 
    	
    {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);
        
        // User plays S1, S2, S3
        store.addRecentlyPlayed("user1", "S1");
        store.addRecentlyPlayed("user1", "S2");
        store.addRecentlyPlayed("user1", "S3");
        LinkedList<String> playlist = store.getRecentlyPlayed("user1");
        System.out.println(playlist);  // [S3, S2, S1]
        
        // User plays S4
        store.addRecentlyPlayed("user1", "S4");
        playlist = store.getRecentlyPlayed("user1");
        System.out.println(playlist);  // [S4, S2, S3]
        
        // User plays S2
        store.addRecentlyPlayed("user1", "S2");
        playlist = store.getRecentlyPlayed("user1");
        System.out.println(playlist);  // [S2, S4, S3]
        
        // User plays S1
        store.addRecentlyPlayed("user1", "S1");
        playlist = store.getRecentlyPlayed("user1");
        System.out.println(playlist);  // [S1, S2, S4]
    }
}



