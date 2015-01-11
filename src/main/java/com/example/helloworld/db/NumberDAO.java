package com.example.helloworld.db;

import com.example.helloworld.core.Number;
import com.google.common.base.Optional;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

public class NumberDAO extends AbstractDAO<Number> {

	public NumberDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}
	
	public Optional<Number> findById(Long id) {
		return Optional.fromNullable(get(id));
	}
	
	public Number create(Number number) {
		return persist(number);
	}
	
	public List<Number> findAll() {
		return list(namedQuery("com.example.helloworld.core.Number.findAll"));
	}
	

}
