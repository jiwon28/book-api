package com.jiwon.bookapi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BookControllerTests {

	private final BookController controller = new BookController();

	@Test
	void returnsBooks() {
		var books = controller.books();

		assertThat(books).hasSize(2);
		assertThat(books.getFirst().title()).isEqualTo("Clean Code");
	}

	@Test
	void returnsVersion() {
		assertThat(controller.version().version()).isEqualTo("v1");
	}
}
