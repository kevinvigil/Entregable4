package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private LocalDate creationDate;

    @Column
    private long credits;

    @ManyToMany(mappedBy = "Accounts")
    private Set<User> users;
}