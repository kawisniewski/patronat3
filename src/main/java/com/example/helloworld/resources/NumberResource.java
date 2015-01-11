package com.example.helloworld.resources;

import com.example.helloworld.Numbers;
import com.example.helloworld.core.Number;
import com.example.helloworld.core.Person;
import com.example.helloworld.db.NumberDAO;
import com.example.helloworld.db.PersonDAO;
import com.example.helloworld.views.PersonView;
import com.google.common.base.Optional;

import io.dropwizard.hibernate.UnitOfWork;
import io.dropwizard.jersey.params.LongParam;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;
import java.util.ArrayList;

@Path("/numbers/{numberValue}")
public class NumberResource {
	private final NumberDAO numberDAO;
	
	public NumberResource(NumberDAO numberDAO) {
		this.numberDAO = numberDAO;
	}
	

	
	@GET
	@Path("/list")
	public List<Number> listNumbers() {
		return numberDAO.findAll();
	}
	
	@GET
	@Path("/sorted")
	public void ListSorted() {
		
	}
	
	@GET
	@Path("/sum")
	public void ViewSum() {
		
	}
	
	@GET
	@Path("/mean")
	public void ViewMean() {
		
	}
	
	@POST
    @UnitOfWork
    public String addNumber() {
		Numbers numbers1 = new Numbers();
		numbers1.addValue(12);
		return "Dodano liczbę.";
	}
    /*public Number createNumber(Number number) {
        return numberDAO.create(number);
    }*/
}

/*@Path("/numbers/{numberId}")
@Produces(MediaType.APPLICATION_JSON)
public class NumberResource {
	private final NumberDAO numberDAO;
	
	public NumberResource(NumberDAO numberDAO) {
		this.numberDAO = numberDAO;
	}
	
	@GET
    @UnitOfWork
    public Number getPerson(@PathParam("personId") LongParam personId) {
        return findSafely(personId.get());
    }

	private Number findSafely(Long numberId) {
		// TODO Auto-generated method stub
		final Optional<Number> number = numberDAO.findById(numberId);
        if (!number.isPresent()) {
            throw new NotFoundException("No such user.");
        }
        return number.get();
	}
}*/
