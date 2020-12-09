package com.oliver.adv.Game.AttackEntities;

import com.oliver.adv.Game.AttackEntity;
import com.oliver.adv.Game.Item;

public class Monster extends AttackEntity {
    private String description;


    public Monster(String name, int hp, int damage, Item[] items, String description) {
        super(name, hp, damage, items);
        this.description = description;
    }
}
