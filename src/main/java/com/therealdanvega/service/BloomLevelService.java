package com.therealdanvega.service;

import com.therealdanvega.repository.BloomLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloomLevelService {
    private BloomLevelRepository bloomLevelRepository;

    @Autowired
    public BloomLevelService(BloomLevelRepository bloomLevelRepository) {
        this.bloomLevelRepository = bloomLevelRepository;
    }
}
