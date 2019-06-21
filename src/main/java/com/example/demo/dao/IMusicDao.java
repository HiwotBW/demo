package com.example.demo.dao;

import com.example.demo.domain.MusixMatchTrack;
import com.example.demo.domain.Track;

import java.util.List;

public interface IMusicDao {
    public List<Track> getTopTracks(String country);
    public MusixMatchTrack getMusixMatchTrack(String track, String Artist, int hasLyrics);
}
