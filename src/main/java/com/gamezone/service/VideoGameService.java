package com.gamezone.service;

import com.gamezone.model.VideoGame;
import com.gamezone.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGameService {

    @Autowired
    private VideoGameRepository repository;

    public List<VideoGame> getAll() {
        return repository.findAll();
    }

    public VideoGame save(VideoGame game) {
        return repository.save(game);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}