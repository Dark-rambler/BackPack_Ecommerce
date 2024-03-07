package com.posgrado.ecommerce;

import com.posgrado.ecommerce.entity.Category;
import com.posgrado.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category();
		category.setName("Sport");
		category.setDescription("mochila deportiva");

		Category category2 = new Category();
		category2.setName("Electronics");
		category2.setDescription("celular");

		Category categorySaved =categoryRepository.save(category);
		Category categorySave2 = categoryRepository.save(category2);

		System.out.println(categorySaved.getId().toString());
		System.out.println(categorySave2.getId().toString());

	}

}
