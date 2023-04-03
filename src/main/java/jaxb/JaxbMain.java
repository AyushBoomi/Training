package main.java.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMain {
    public static void main(String[] args) throws JAXBException {
        Customer customer=new Customer();
        customer.setCustomerName("Ayush");
        customer.setCustomerId(123);
        customer.setAddress("Mac");

        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(customer,System.out);


    }
}
