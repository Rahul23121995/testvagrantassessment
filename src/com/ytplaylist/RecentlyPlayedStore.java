package com.ytplaylist;
import java.util.*;

/**
 * 
 * @author Rahul Shanbhag
 *
 */
public class RecentlyPlayedStore

  {
	    private final int capacity;
	    private final Map<String, LinkedList<String>> playlistMap;

	    public RecentlyPlayedStore(int capacity) {
	        this.capacity = capacity;
	        this.playlistMap = new HashMap<>();
	    }

	    public void addRecentlyPlayed(String user, String song) {
	        LinkedList<String> playlist = playlistMap.computeIfAbsent(user, k -> new LinkedList<>());
	        playlist.remove(song); // remove the song if it already exists
	        playlist.addFirst(song); // add the song to the front of the playlist
	        if (playlist.size() > capacity) {
	            playlist.removeLast(); // remove the least recently played song
	        }
	    }

	    public LinkedList<String> getRecentlyPlayed(String user) {
	        return playlistMap.getOrDefault(user, new LinkedList<>());
	    }
	}


