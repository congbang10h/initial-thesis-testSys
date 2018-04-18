package com.congbang.repository;

import com.congbang.domain.UnivMission;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UnivMissionRepository extends CrudRepository<UnivMission, Integer> {
    List<UnivMission> findByUniversityUnivId(Integer univId);
}
