package Hibernate.MappingManytoMany;




import javax.persistence.*;
import java.util.Set;

@Entity(name="AccountEntity")
@Table(name="Account")
public class ManyToManyAccount {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",unique = true,nullable = false)
    private Integer AccountId;


    @ManyToMany(mappedBy = "accounts",cascade = {CascadeType.ALL})
    private Set<ManyToManyEmployee> manyToManyEmployees;

    @Column(name="acc_number",unique=true,nullable=false,length=100)
    private String accountNumber;

    public ManyToManyAccount() {
    }

    public Integer getAccountId() {
        return AccountId;
    }

    public void setAccountId(Integer accountId) {
        AccountId = accountId;
    }

    public Set<ManyToManyEmployee> getEmployee() {
        return manyToManyEmployees;
    }

    public void setEmployee(Set<ManyToManyEmployee> manyToManyEmployees) {
        this.manyToManyEmployees = manyToManyEmployees;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
