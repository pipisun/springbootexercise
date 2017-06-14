package com.example.demo;

import java.util.List;


public interface IStadiumDao {

	public abstract List<Stadium> getAll();

	public abstract void add(Stadium book);

	public abstract Stadium get(int id);

	public abstract void update(int stadiumId, Stadium book);

	public abstract void delete(int stadiumId);

}