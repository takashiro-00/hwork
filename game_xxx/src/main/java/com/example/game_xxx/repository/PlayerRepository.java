package com.example.game_xxx.repository;

import com.example.game_xxx.DTO.PlayerInfoDTO;
import com.example.game_xxx.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    List<PlayerInfoDTO> fetchPlayerInfo();
}