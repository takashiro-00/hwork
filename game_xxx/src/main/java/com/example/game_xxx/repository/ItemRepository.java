package com.example.game_xxx.repository;

import com.example.game_xxx.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
