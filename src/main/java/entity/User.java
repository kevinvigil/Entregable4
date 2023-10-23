package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String userName;
    @Column
    private long cellPhoneNumber;
    @Column
    private String mail;
    @Column
    private String nombre;
    @Column
    private String apellido;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_accounts", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "account_id", referencedColumnName = "id")
    )
    private Set<Account> Accounts;

    private int mercadoPago;
    public User(){}
}