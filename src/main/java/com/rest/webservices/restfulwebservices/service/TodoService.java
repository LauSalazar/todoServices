package com.rest.webservices.restfulwebservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.webservices.restfulwebservices.model.Todo;

@Service
public class TodoService {

	private static List<Todo> todoList = new ArrayList<>();
	private static Long idCounter = 0L;
	static {
		todoList.add(new Todo(idCounter++,"lsalazar","Learn react", new Date(), false));
		todoList.add(new Todo(idCounter++,"lsalazar","Learn Spring boot", new Date(), false));
		todoList.add(new Todo(idCounter++,"lsalazar","Learn Node", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todoList;
	}
	
	public Todo deleteById(Long id) {
		Todo todo = findById(id);
		if(todo == null) return null;
		if(todoList.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo findById(Long id) {
		for (Todo todo : todoList) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todoList.add(todo);
		} else {
			todoList.remove(todo);
			todoList.add(todo);
		}
		return todo;
	}
}
