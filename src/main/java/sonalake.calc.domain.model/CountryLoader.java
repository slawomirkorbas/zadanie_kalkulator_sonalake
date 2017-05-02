package sonalake.calc.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sonalake.calc.repository.CountryRepository;


import java.math.BigDecimal;


/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 5/1/17
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */

@Component
public class CountryLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    CountryRepository countryRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        addCountry( "GBR", "United Kingdom", "GBP", BigDecimal.valueOf(25), BigDecimal.valueOf(600)  );
        addCountry( "GER", "Germany",        "EUR", BigDecimal.valueOf(20), BigDecimal.valueOf(800)  );
        addCountry( "POL", "Poland",         "PLN", BigDecimal.valueOf(19), BigDecimal.valueOf(1200) );
    }

    private void addCountry( String code, String name, String currencyCode, BigDecimal tax, BigDecimal costs ) {
        Country country = new Country( code, name );
        country = countryRepository.save(country);
        country.setCurrency( new Currency(currencyCode) );
        country.setTaxation( new Taxation(tax, costs));
        countryRepository.save(country);
    }
}
