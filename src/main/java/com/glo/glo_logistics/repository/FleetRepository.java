package com.glo.glo_logistics.repository;

import java.util.ArrayList;
import java.util.List;

import com.glo.glo_logistics.model.Fleet;

public class FleetRepository {
	private List<Fleet> fleets = new ArrayList<>();

	public List<Fleet> getAllFleets() {
		return fleets;
	}

	public void addFleet(Fleet fleet) {
		fleets.add(fleet);
	}
}
