package com.paynbuy.inventory.service;

import com.paynbuy.inventory.service.model.Inventory;
import com.paynbuy.inventory.service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return  args -> {
			Inventory inventory = new Inventory();
			inventory.setQuantity(100);
			inventory.setSkuCode("phone1");

			Inventory inventory1 = new Inventory();
			inventory1.setQuantity(200);
			inventory1.setSkuCode("1plus");
		};
	}
}
