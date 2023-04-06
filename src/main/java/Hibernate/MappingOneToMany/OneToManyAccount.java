package Hibernate.MappingOneToMany;



import javax.persistence.*;

@Entity(name="ForeignKeyAccountEntity")
@Table(name="account")
public class OneToManyAccount {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID",unique = true,nullable = false)
    private Integer AccountId;


    @ManyToOne
    private OneToManyEmployee oneToManyEmployee;

    @Column(name="acc_number",unique=true,nullable=false,length=100)
    private String accountNumber;

    public OneToManyAccount() {
    }

    public Integer getAccountId() {
        return AccountId;
    }

    public void setAccountId(Integer accountId) {
        AccountId = accountId;
    }

    public OneToManyEmployee getEmployee() {
        return oneToManyEmployee;
    }

    public void setEmployee(OneToManyEmployee oneToManyEmployee) {
        this.oneToManyEmployee = oneToManyEmployee;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
