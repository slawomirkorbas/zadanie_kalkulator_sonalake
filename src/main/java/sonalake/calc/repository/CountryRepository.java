package sonalake.calc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sonalake.calc.domain.model.Country;


/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 5/1/17
 * Time: 10:40 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    @Query("SELECT c FROM Country c WHERE c.code = ?1")
    Country findByCountryCode(String code);
}
