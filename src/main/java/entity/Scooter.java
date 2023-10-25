package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Scooter {

    @Id
    private long id;

    @Column
    private static long normalRate;

    @Column
    private static long extraRate;

    @Column
    private LocalDate activeTime;

    @Column
    private long kilometres;
}
