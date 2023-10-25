package repository;

import entity.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("AccountRepository")
public interface AccountRepository extends baseRepository<Account, Long>{

    @Query(
            " update Account a set a.credits = (a.credits + :credits) where a.id = :id "
    )
    void enterCredit(@Param("id") long id,@Param("credits") long credits);


}
