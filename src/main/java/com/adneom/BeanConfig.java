package com.adneom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Beer getBeer(){
		Beer beer = new Beer();
		beer.setName("Chimay Grande R�serve");
		beer.setBrewery("Bi�res de Chimay Belgian");
		beer.setType("Strong Dark Ale");
		return beer;
	}

	@Bean(name = "Nuka")
    public Brewery getNukaBruwery() {
	    Brewery brewery = new NukaBeerBrewery();
	    return brewery;
    }

    @Bean(name = "Cara")
    public Brewery getCaraPisseBrewry() {
	    Brewery brewery = new CaraPisseBrewery();
	    return brewery;
    }
}
