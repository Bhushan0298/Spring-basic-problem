package com.glo.glo_logistics.service;

import java.util.List;

import com.glo.glo_logistics.model.Fleet;

public interface FleetService {
	List<Fleet> getAllFleets();

	void addFleet(Fleet fleet);
}
