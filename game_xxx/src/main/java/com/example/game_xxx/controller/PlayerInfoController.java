package com.example.game_xxx.controller;

import com.example.game_xxx.DTO.PlayerInfoDTO;
import com.example.game_xxx.repository.PlayerRepository;
import com.example.game_xxx.service.PlayerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/playerinfor")
public class PlayerInfoController {

    @Autowired
    private PlayerInfoService playerInfoService;

    @GetMapping
    public List<PlayerInfoDTO> getPlayerInfo() {
        return playerInfoService.getAllPlayerInfo();
    }
}
