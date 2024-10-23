package com.example.game_xxx.repository;

import com.example.game_xxx.entity.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Integer> {
}