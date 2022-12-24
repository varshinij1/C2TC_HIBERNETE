package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.service.CollegeService;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.PlacementService;
import com.cg.placement.service.PlacementServiceImpl;
import com.cg.placement.service.StudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		student.setId(7);
		student.setName("john");
		student.setCollege("CIT");
		student.setRoll(101);
		student.setQuali("BE");
		student.setCourse("Civil");
		//student.setHallTickectNo(101);
		student.setYear(2024);
		service.addStudent(student);
		
		PlacementService service1= new PlacementServiceImpl();
		Placement placement =new Placement();
		placement.setId(1);
		placement.setName("suma");
		placement.setCollege("BIT");
		placement.setLocalDate(null);
		placement.setQuali("BE");
		placement.setYear(2024);
		service1.addPlacement(placement);
		
		CollegeService service2= new CollegeServiceImpl();
		
		College college = new College();
		college.setCollegeName("SIET");
		college.setId(2);
		college.setLocation("Tumkur");
		service2.addCollege(college);
	}

}
