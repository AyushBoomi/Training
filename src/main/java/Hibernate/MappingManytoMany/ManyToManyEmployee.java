package Hibernate.MappingManytoMany;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name="EmployeeEntity")
@Table(name="Employee")
public class ManyToManyEmployee implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id",unique = true,nullable = false)
    private Integer employeeId;

    @Column(name = "email",unique = true,nullable = false,length=100)
    private String email;
    @Column(name = "first_name",unique = false,nullable = false,length=100)
    private String firstname;

    @Column(name = "last_name",unique = false,nullable = false,length=100)
    private String lastname;
    @ManyToMany(targetEntity = ManyToManyAccount.class,cascade = CascadeType.ALL)
    @JoinTable(name="employees_accounts",
            joinColumns = {@JoinColumn(name="employee_id")},inverseJoinColumns = {@JoinColumn(name="account_id")})
    public Set<ManyToManyAccount> accounts;

    public Set<ManyToManyAccount> getAccounts() {
        return accounts;
    }

    public void setAccount(Set<ManyToManyAccount> accounts) {
        this.accounts = accounts;
    }

    public ManyToManyEmployee() {
    }

    public ManyToManyEmployee(String email, String firstname, String lastname) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
