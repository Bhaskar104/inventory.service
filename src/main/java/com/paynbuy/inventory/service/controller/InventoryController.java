package com.paynbuy.inventory.service.controller;


import com.paynbuy.inventory.service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
    @GetMapping("/{sku_code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock (@PathVariable("sku_code") String skuCode ){
        return inventoryService.isInStock(skuCode);
    }
}
