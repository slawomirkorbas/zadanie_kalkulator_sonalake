package sonalake.calc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sonalake.calc.domain.model.Country;
import sonalake.calc.repository.CountryRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 4/28/17
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */


@RestController
public class CountryController {


    @Autowired
    CountryRepository countryRepository;


    @RequestMapping( value = "/country/", produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody
    Country countryByCode(@RequestParam("countryCode") String countryCode) {

        return countryRepository.findByCountryCode(countryCode);
    }

    @RequestMapping( value = "/country/all/", produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody
    List<Country> countries() {

        return countryRepository.findAll();
    }



}
