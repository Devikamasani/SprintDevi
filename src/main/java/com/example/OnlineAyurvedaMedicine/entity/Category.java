package com.example.OnlineAyurvedaMedicine.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long categoryId;
	private String categoryName;

}
