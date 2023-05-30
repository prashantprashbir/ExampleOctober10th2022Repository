package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecentlyPlayedStore {
    private final int capacity;
    private final Map<String, String[]> recentlyPlayedMap;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.recentlyPlayedMap = new LinkedHashMap<>();
    }

    public void playSong(String user, String song) {
        if (!recentlyPlayedMap.containsKey(user)) {
            recentlyPlayedMap.put(user, new String[capacity]);
        }

        String[] playlist = recentlyPlayedMap.get(user);
        shiftSongsRight(playlist);
        playlist[0] = song;
    }

    public String[] getRecentlyPlayedSongs(String user) {
        return recentlyPlayedMap.getOrDefault(user, new String[0]);
    }

    private void shiftSongsRight(String[] playlist) {
        for (int i = playlist.length - 1; i > 0; i--) {
            playlist[i] = playlist[i - 1];
        }
    }

    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.playSong("User1", "S1");
        store.playSong("User1", "S2");
        store.playSong("User1", "S3");
        System.out.println("User1 recently played songs: " +String.join(",", store.getRecentlyPlayedSongs("User1")));

        store.playSong("User1", "S4");
        System.out.println("User1 recently played songs: " + String.join(",", store.getRecentlyPlayedSongs("User1")));

        store.playSong("User1", "S2");
        System.out.println("User1 recently played songs: " +String.join(",", store.getRecentlyPlayedSongs("User1")));

        store.playSong("User1", "S1");
        System.out.println("User1 recently played songs: "+ String.join(",", store.getRecentlyPlayedSongs("User1")));
    }
}
