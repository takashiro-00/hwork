package com.example.game_xxx.repository;

import com.example.game_xxx.entity.PlayerItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerItemRepository extends JpaRepository<PlayerItem, PlayerItem.PlayerItemId> {
}
