package com.adneom;

/**
 * Created by gm on 27.02.17.
 */
public class CaraPisseBrewery implements Brewery  {
    public Beer makeBeer() {
        Beer beer = new Beer();
        beer.setName("CaraPisse");
        beer.setBrewery("Disgusting brand of beer");
        beer.setType("Beurk");
        return beer;
    }
}
