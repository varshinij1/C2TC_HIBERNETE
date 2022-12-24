package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.repository.CollegeRepo;
import com.cg.placement.repository.CollegeRepoImpl;
import com.cg.placement.repository.PlacementRepo;
import com.cg.placement.repository.PlacementRepoImpl;

public class CollegeServiceImpl implements CollegeService {
	private CollegeRepo repo;
	public CollegeServiceImpl()
	{
		repo = new CollegeRepoImpl();
	}
	@Override
	public void addCollege(College college) {
	repo.beginTransaction();
	repo.addCollege(college);
	repo.commitTransaction();
	}
	@Override
	public void updateCollege(College college) {
	repo.beginTransaction();
	repo.addCollege(college);
	repo.commitTransaction();
	}
	@Override
	public void searchCollege(long id) {
	repo.beginTransaction();
	repo.searchCollege(id);
	repo.commitTransaction();
	}
	@Override
	public boolean deleteCollege(long id) {
	repo.beginTransaction();
	repo.searchCollege(id);
	repo.commitTransaction();
	return true;
	}
	@Override
	public boolean schedulePlacement(Placement placement) {
	repo.beginTransaction();
	repo.schedulePlacement(placement);
	repo.commitTransaction();
	return true;
	}
	
	

}
