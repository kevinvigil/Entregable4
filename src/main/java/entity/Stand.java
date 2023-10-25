package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Stand {
    @Id
    private  Long id;

}
