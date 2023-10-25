package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Stand {
    @Id
    private  Long id;

    @OneToMany
    private Set<Scooter> scooters;
}
