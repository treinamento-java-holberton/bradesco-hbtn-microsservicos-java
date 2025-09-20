package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private final List<Song> list = new ArrayList<>();

    public SongRepository() {
        var song1 = new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975");
        var song2 = new Song(2, "Imagine", "John Lennon", "Imagine", "1971");
        list.add(song1);
        list.add(song2);
    }

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.stream().filter( i -> id.equals(i.getId())).findFirst().orElseThrow();
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        var songToUpdate = getSongById(s.getId());
        list.set(list.indexOf(songToUpdate), s);
    }

    public void removeSong(Song s) {
        list.remove(s);
    }
}