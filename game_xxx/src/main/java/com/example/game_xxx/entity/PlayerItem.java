package com.example.game_xxx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "player_item_t")
public class PlayerItem {
    @Id
    private String itemId;
    @Id
    private Integer playerId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public class PlayerItemId implements Serializable {
        private String item;
        private int player;

        // Equals and hashCode methods
    }
}