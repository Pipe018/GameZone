package com.gamezone.controller;

import com.gamezone.model.VideoGame;
import com.gamezone.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
@CrossOrigin("*")
public class VideoGameController {

    @Autowired
    private VideoGameService service;

    @GetMapping
    public List<VideoGame> getAll() {
        return service.getAll();
    }

    @PostMapping
    public VideoGame save(@RequestBody VideoGame game) {
        return service.save(game);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}