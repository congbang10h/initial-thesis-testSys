package com.therealdanvega.service;

import com.therealdanvega.domain.BloomLevel;
import com.therealdanvega.repository.BloomLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloomLevelService {
    private BloomLevelRepository bloomLevelRepository;

    @Autowired
    public BloomLevelService(BloomLevelRepository bloomLevelRepository) {
        this.bloomLevelRepository = bloomLevelRepository;
    }

    public List<BloomLevel> list() {
        return bloomLevelRepository.findAllByOrderByBloomLevelCodeAsc();
    }
}
