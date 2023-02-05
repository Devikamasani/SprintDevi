 package com.example.OnlineAyurvedaMedicine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAyurvedaMedicine.entity.Category;
	@Repository
	public interface CategoryRepository extends JpaRepository<Category, Long> {

		List<Category> findBycategoryName(String categoryName);

		Optional<Category> findById(long id);

		void deleteById(long id);

	}
