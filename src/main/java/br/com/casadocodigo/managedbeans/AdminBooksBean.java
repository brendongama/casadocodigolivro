package br.com.casadocodigo.managedbeans;



import javax.enterprise.inject.Model;

import br.com.casadocodigo.models.Book;

@Model
public class AdminBooksBean {
	
	private Book product = new Book();

	public void save() {		
		System.out.println(product.getTitle());
	}

	public Book getProduct() {
		return product;
	}
	
	
}
