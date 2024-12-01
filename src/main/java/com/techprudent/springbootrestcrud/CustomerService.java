package com.techprudent.springbootrestcrud;

public interface CustomerService {

	public boolean deleteCustomer(long id) ;

    public default Customer updateCustomer(Customer updateCustomer) {
        return null;
    }

    public Customer createCustomer(Customer customer) ;

	public Customer getCustomer(long id) ;

}
