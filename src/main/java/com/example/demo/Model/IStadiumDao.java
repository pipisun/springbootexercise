package com.example.demo.Model;

import java.util.List;

import com.example.demo.Entity.Stadium;


public interface IStadiumDao {

	public abstract List<Stadium> getAll();

	public abstract void add(Stadium book);

	public abstract Stadium get(int id);

	public abstract void update(int stadiumId, Stadium book);

	public abstract void delete(int stadiumId);

}