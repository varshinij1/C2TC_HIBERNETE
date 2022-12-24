package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;



public interface CollegeService {
	public abstract void addCollege(College college);
	public abstract void updateCollege(College college);
	public abstract void searchCollege(long id);
	public abstract boolean deleteCollege(long id);
	public abstract boolean schedulePlacement(Placement placement);

}
