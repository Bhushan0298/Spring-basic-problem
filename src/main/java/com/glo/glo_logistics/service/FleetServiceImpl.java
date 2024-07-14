package com.glo.glo_logistics.service;

import java.util.List;

import com.glo.glo_logistics.model.Fleet;
import com.glo.glo_logistics.repository.FleetRepository;

public class FleetServiceImpl implements FleetService {
	private FleetRepository fleetRepository;

	public FleetServiceImpl(FleetRepository fleetRepository) {
		this.fleetRepository = fleetRepository;
	}

	@Override
	public List<Fleet> getAllFleets() {
		return fleetRepository.getAllFleets();
	}

	@Override
	public void addFleet(Fleet fleet) {
		fleetRepository.addFleet(fleet);
	}
}
