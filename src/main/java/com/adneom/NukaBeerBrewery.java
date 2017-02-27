package com.adneom;

/**
 * Created by gm on 27.02.17.
 */
public class NukaBeerBrewery implements Brewery {
    public Beer makeBeer() {
        Beer beer = new Beer();
        beer.setName("NukaBeer");
        beer.setBrewery(getClass().toString());
        beer.setType("Trappiste");
        return beer;
    }
}
