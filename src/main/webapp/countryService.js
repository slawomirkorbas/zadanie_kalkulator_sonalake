var countryService = {

    getCountries : function( callback ) {
        $.get("http://localhost:8080/country/all/", function(countryCollection, status){
            console.log("Data: " + JSON.stringify(countryCollection) + "\nStatus: " + status);
            callback( countryCollection );
        });
    },

    getCountry: function( countryCode, callback ) {
        $.get("http://localhost:8080/country/", { countryCode: countryCode },function(country, status){
            console.log("Data: " + JSON.stringify(country) + "\nStatus: " + status);
            callback(country);
        });
    }
};