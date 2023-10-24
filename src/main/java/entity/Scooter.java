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
    public static long normalRate;

    @Column
    public static long extraRate;

    @Column
    private LocalDate activeTime;

    @Column
    private long kilometres;
}
