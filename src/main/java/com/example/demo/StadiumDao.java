package com.example.demo;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StadiumDao implements IStadiumDao {
	private static int idCount = 1;
	private Map<Integer, Stadium> stadiums = new HashMap<>();

	public StadiumDao() {
		add(new Stadium(1, "Stadium1", "City1", "State1", new ArrayList<Match>()));
		add(new Stadium(1, "Stadium2", "City2", "State2", new ArrayList<Match>()));
	}

	@Override
	public List<Stadium> getAll() {
		return new ArrayList<Stadium>(stadiums.values());
	}

	@Override
	public void add(Stadium stadium) {
		stadium.setStadiumKey(idCount);
		stadiums.put(idCount, stadium);
		idCount++;
	}

	@Override
	public Stadium get(int id) {
		Stadium result = stadiums.get(id);

		if (result == null) {
//			throw new NoSuchResourceException("Stadium", id);
		}

		return result;
	}

	@Override
	public void update(int bookId, Stadium stadium) {
		stadiums.put(bookId, stadium);
	}

	@Override
	public void delete(int stadiumId) {
		Stadium removed = stadiums.remove(stadiumId);
		if (removed == null) {
//			throw new NoSuchResourceException("Book", bookId);
=======
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
>>>>>>> branch 'master' of https://github.com/pipisun/springbootexercise.git
		}
	}
}
