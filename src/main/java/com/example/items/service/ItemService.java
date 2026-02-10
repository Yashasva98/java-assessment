package com.example.items.service;

import com.example.items.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();

    // Add a new item
    public Item addItem(Item item) {
        // Generate a random UUID for the item ID if not provided
        if (item.getId() == null || item.getId().isEmpty()) {
            item.setId(UUID.randomUUID().toString());
        }
        items.add(item);
        return item;
    }

    // Get an item by ID
    public Optional<Item> getItem(String id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
    
    // Get all items (optional helper)
    public List<Item> getAllItems() {
        return new ArrayList<>(items);
    }
}
