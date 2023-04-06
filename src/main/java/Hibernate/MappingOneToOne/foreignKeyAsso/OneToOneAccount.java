package Hibernate.MappingOneToOne.foreignKeyAsso;

import javax.persistence.*;

@Entity(name="ForeignKeyAccountEntity")
@Table(name="account")
public class OneToOneAccount {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID",unique = true,nullable = false)
    private Integer AccountId;


    @OneToOne(mappedBy = "account")
    private OneToOneEmployee employee;

    @Column(name="ac_number",unique=true,nullable=false,length=100)
    private String accountNumber;

    public OneToOneAccount() {
    }

    public Integer getAccountId() {
        return AccountId;
    }

    public void setAccountId(Integer accountId) {
        AccountId = accountId;
    }

    public OneToOneEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(OneToOneEmployee employee) {
        this.employee = employee;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
