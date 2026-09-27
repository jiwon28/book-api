package com.jiwon.bookapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private static final List<Book> BOOKS = List.of(
			new Book(1L, "Clean Code", "Robert C. Martin"),
			new Book(2L, "The Phoenix Project", "Gene Kim, Kevin Behr, George Spafford"));

	@GetMapping("/books")
	public List<Book> books() {
		return BOOKS;
	}

	@GetMapping("/version")
	public VersionResponse version() {
		return new VersionResponse("v1");
	}
}
