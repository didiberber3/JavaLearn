package com.jl.generic.hm;

import org.junit.Test;

import java.util.*;


public class h1 {

	public static void main(String[] args) {


	}

	@Test
	public void testList() {
		DAO<User> DAO = new DAO<>();
		DAO.save("001", new User(1, 10, "jack"));
		DAO.save("002", new User(2, 53, "jack"));
		DAO.save("003", new User(3, 73, "jack"));
		DAO.save("004", new User(4, 523, "jack"));
		DAO.save("005", new User(5, 48, "jack"));

		List<User> list = DAO.list();

		System.out.println(list);


	}
}

class DAO<T> {
	Map<String, T> map = new HashMap();


	public void save(String id, T entity) {
		map.put(id, entity);
	}


	public T get(String id) {
		return map.get(id);
	}


	public void update(String id, T entity) {
		map.put(id, entity);
	}


	public List<T> list() {
		ArrayList<T> list = new ArrayList<>();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			list.add(map.get(key));
		}
		return list;
	}


	public void delete(String id) {
		Iterator<Map.Entry<String, T>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, T> entry = it.next();
			if (entry.getValue().equals(id)) {
				it.remove();
			}
		}
	}


}

class User {
	private int id;
	private int age;
	private String name;

	public User(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}

