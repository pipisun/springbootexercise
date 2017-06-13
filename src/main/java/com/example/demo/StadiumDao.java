package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cs544.sample.NoSuchResourceException;

public class StadiumDao implements IStadiumDao {
	private static int idCount = 1;
	private Map<Integer, Book> books = new HashMap<>();

	public StadiumDao() {
		ArrayList<Match> matches = new ArrayList<>();
		matches.add(new Match());
		
		add(new Stadium(1, "Stadium1", "City1", "State1", new ArrayList<Match>()));
		add(new Book("Book 2", "002", "Author 2", 1000));
	}

	@Override
	public List<Book> getAll() {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public void add(Book book) {
		book.setId(idCount);
		books.put(idCount, book);
		idCount++;
	}

	@Override
	public Book get(int id) {
		Book result = books.get(id);

		if (result == null) {
			throw new NoSuchResourceException("Book", id);
		}

		return result;
	}

	@Override
	public void update(int bookId, Book book) {
		books.put(bookId, book);
	}

	@Override
	public void delete(int bookId) {
		Book removed = books.remove(bookId);
		if (removed == null) {
			throw new NoSuchResourceException("Book", bookId);
		}
	}
}
