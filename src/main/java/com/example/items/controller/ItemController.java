package com.example.items.controller;

import com.example.items.model.Item;
import com.example.items.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    // Constructor injection
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // POST /items - Add new item
    @PostMapping
    public ResponseEntity<Item> createItem(@Valid @RequestBody Item item) {
        Item createdItem = itemService.addItem(item);
        return new ResponseEntity<>(createdItem, HttpStatus.CREATED);
    }

    // GET /items/{id} - Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable String id) {
        Optional<Item> item = itemService.getItem(id);
        return item.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // GET / - Root endpoint (Welcome message)
    @GetMapping("/")
    public String home() {
        return "Welcome to the Java Assessment API! Use POST /items to add items and GET /items to see them.";
    }
}
