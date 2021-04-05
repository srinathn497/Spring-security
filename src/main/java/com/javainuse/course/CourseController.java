package com.javainuse.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.BusinessService;

@RestController
public class CourseController {

	@Autowired
	private BusinessService bs;
	
	@RequestMapping("/welcome")
	public String home()
	{
	return("<h1>Welcome</h1>");	
	}
	
	@RequestMapping("/Courses")
	public List<Courses> getAllTopics()
	{
	 	 return bs.getAllCourses();
			 
	}
	
		
	@RequestMapping("/Courses/{id}")
	public Optional<Courses> getAllCourseById(@PathVariable int id)
	{
	//return("<h1>Welcome</h1>");
	return bs.getCoursesByID(id)	;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Courses")
	public void addCourses(@RequestBody Courses course)
	{
	//return("<h1>Welcome</h1>");
	  bs.addCourses(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Courses/{id}")
	public void updateTopics(@RequestBody Courses course, @PathVariable int id)
	{
	//return("<h1>Welcome</h1>");
	  bs.updateCourse(id,course);	
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/Courses/{id}")
	public void deleteTopics(@RequestBody Courses course, @PathVariable int id)
	{
	//return("<h1>Welcome</h1>");
	  bs.deleteCourses(id,course);	
	}
}

