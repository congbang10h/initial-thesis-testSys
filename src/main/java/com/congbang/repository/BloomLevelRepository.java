package com.congbang.repository;

import com.congbang.domain.BloomLevel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BloomLevelRepository extends CrudRepository<BloomLevel, Integer> {
    List<BloomLevel> findAllByOrderByBloomLevelCodeAsc();
}
