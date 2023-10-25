package DAO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DAO_Account {
    private LocalDate creationDate;
    private long credits;

    public DAO_Account(LocalDate creationDate, long credits){
        this.creationDate = creationDate;
        this.credits = credits;
    }
}
