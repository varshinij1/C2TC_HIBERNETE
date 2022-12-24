package com.cg.placement.service;

import com.cg.placement.entities.Placement;


public interface PlacementService {
	public abstract void addPlacement(Placement placement);
	public abstract void updatePlacement(Placement placement);
	public abstract void searchPlacement(long id);
	public abstract boolean cancelPlacement(long id);
}
