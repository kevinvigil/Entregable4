package repository;

import entity.Stand;
import org.springframework.stereotype.Repository;

@Repository("StandRepository")
public interface StandRepository extends baseRepository<Stand, Long> {


}
