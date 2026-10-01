package com.example;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String books;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Author> author;

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getBooks() {
		return books;
	}

	
	public void setBooks(String books) {
		this.books = books;
	}


	public List<Author> getAuthor() {
		return author;
	}

	
	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public Book(String books, List<Author> author) {
		super();
		this.books = books;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", books=" + books + ", author=" + author + "]";
	}
	
	
	
	
	
	

}
