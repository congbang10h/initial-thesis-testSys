package com.congbang.repository;

import com.congbang.domain.UnivMissionItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UnivMissionItemRepository extends CrudRepository<UnivMissionItem, Integer> {
    List<UnivMissionItem> findAllByUnivMissionUmId(Integer umId);

    List<UnivMissionItem> findByUmiCodeContaining(String q);
}
