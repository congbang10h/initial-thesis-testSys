package com.therealdanvega.repository;

import com.therealdanvega.domain.BloomLevel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BloomLevelRepository extends CrudRepository<BloomLevel, Integer> {
    List<BloomLevel> findAllByOrderByBloomLevelCodeAsc();
}
