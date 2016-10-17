package com.adneom;

public class ChimayBrewery implements Brewery {
	private Beer insignia;
	private final String name = "Bi�res de Chimay Belgian";

	public ChimayBrewery() {
	}

	public ChimayBrewery(Beer insignia) {
		super();
		this.insignia = insignia;
	}

	@Override
	public Beer getInsignia() {
		return insignia;
	}

	public void setInsignia(Beer insignia) {
		this.insignia = insignia;
	}

	@Override
	public String getName() {
		return name;
	}
}
