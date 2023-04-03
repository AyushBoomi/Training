package main.java.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

    public int customerId;
    public String customerName;
    public String address;

//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public String getAddress() {
//        return address;
//    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
