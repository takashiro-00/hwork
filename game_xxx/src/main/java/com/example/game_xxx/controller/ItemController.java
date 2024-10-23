package com.example.game_xxx.controller;

import com.example.game_xxx.entity.Item;
import com.example.game_xxx.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Map<String, String>> addItem(@RequestBody Item item) {
        boolean status = itemService.addItem(item);
        Map<String, String> response = new HashMap<>();
        response.put("Status", status ? "True" : "False");
        response.put("ErrorCode", status ? "200" : "400");
        return ResponseEntity.ok(response);
    }
}
