package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "Travel")
public class Travel {
    @Id
    private long id;
    @Column
    private long idScooter;
    @Column
    private long kilometres;
    @Column
    private LocalDate startTravel;
    @Column
    private LocalDate endTravel;
}
