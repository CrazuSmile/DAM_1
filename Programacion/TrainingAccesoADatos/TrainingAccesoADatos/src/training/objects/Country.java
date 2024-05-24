/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.objects;

import java.util.Date;

/**
 * Clase para representar cada registro de la tabla <code>country</code>
 * @author jsanm
 */
public class Country {

    private Short countryId; 
    private String countryName;
    private Date lastUpdate;
    
     public Country(Short countryId, String country, Date lastUpdate) {
        this.setCountryId(countryId);
        this.setCountryName(country);
        this.setLastUpdate(lastUpdate);
    }

    public Short getCountryId() {
        return countryId;
    }

    public final void setCountryId(Short countryId) {
        if(countryId==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public final void setCountryName(String country) {
        if(country==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.countryName = country;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public final void setLastUpdate(Date lastUpdate) {
        if(lastUpdate==null)
            throw new IllegalArgumentException("No se admite valor nulo");
        this.lastUpdate = lastUpdate;
    }
    
}
