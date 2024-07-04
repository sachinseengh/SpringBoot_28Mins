package com.sachin.spring_boot.learning_springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {
	
	
	@RequestMapping("/courses")
	public List<Course> retrieveCourses(){
		return Arrays.asList(

				new Course(1,"Java","Sagar Sir"),
				new Course(2,"Php","Sujan Lamsal"),
				new Course(3,"c"," Lamsal"),
				new Course(4,"python","ranjit"),
				new Course(5,"react","dip"),
				
				new Course(6,"html","niraj")
				
				
				);
	}

}
