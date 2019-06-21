package com.example.demo.controller;

import com.example.demo.domain.Track;
import com.example.demo.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/top")
@CrossOrigin
public class MusicController {
    private IMusicService musicService;

    @Autowired
    MusicController(IMusicService musicService){
        this.musicService = musicService;
    }

    @CrossOrigin
    @GetMapping("")

    public ResponseEntity<?> getTopTrack(@RequestParam(required = true, value = "country") String country){
        Track track;
        try {
           return new ResponseEntity<Track>( musicService.getTopTrack(country), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
