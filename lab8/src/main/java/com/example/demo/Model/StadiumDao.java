package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.Entity.Match;
import com.example.demo.Entity.Stadium;

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
		}
	}
}
