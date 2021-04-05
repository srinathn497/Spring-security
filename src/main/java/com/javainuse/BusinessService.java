package com.javainuse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.javainuse.course.CourseRepository;
import com.javainuse.course.Courses;
import com.javainuse.topics.Topics;
import com.javainuse.topics.TopicsRepository;

@Service
public class BusinessService {

	@Autowired
	private TopicsRepository crdrepo;
	
	@Autowired
	private CourseRepository courserepo;
	
	/*
	 * private List<Topics> topics = new ArrayList<>(Arrays.asList( new
	 * Topics(10,20,30), new Topics(40,50,60) //new Topics()
	 * 
	 * //new Topics() ));
	 */
	
	public List<Topics> getAllTopics()
	{
		List<Topics> topics = new ArrayList<>(); 
		crdrepo.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public List<Courses> getAllCourses()
	{
		List<Courses> courses = new ArrayList<>(); 
		courserepo.findAll()
		.forEach(courses::add);
		return courses;
	}
		
	public Optional<Topics> getTopicsByID(long id)
	{ 	 
		//return topics.stream().filter(t -> t.equals(i)).findFirst().get();
		//return topics.stream().filter(t ->t.getB().equals(i)).findFirst().get();
		//return topics.stream().filter(t ->t.getA() ==i).findFirst().get();
		return crdrepo.findById(id);
						
 	 }

	public Optional<Courses> getCoursesByID(long id)
	{ 	 
		return courserepo.findById(id);
						
 	 }
	public void addTopics(Topics topics2)
	{ // TODO Auto-generated method stub
		//topics.add(topics2);
		crdrepo.save(topics2);
		 
	}
	
	public void addCourses(Courses course)
	{ // TODO Auto-generated method stub
		//topics.add(topics2);
		courserepo.save(course);
		 
	}
		/*
		 * public void addTopics(Topics topics2) { // TODO Auto-generated method stub
		 * topics.add(topics2); }
		 */

	public void updateTopics(int id, Topics topics2) {
		/*
		 * for(int i=0;i<= topics.size();i++) { System.out.println("Size of i"+i);
		 * System.out.println("value of i"+topics.get(i)); Topics t = topics.get(i);
		 * System.out.println("t.getA()"+t.getA()); System.out.println("id"+id);
		 * System.out.println("id"+topics2); if(t.getA()==id) {
		 * System.out.println(+t.getA()+"=="+id); topics.set(i, topics2); return; }
		 * 
		 * }
		 */
		crdrepo.save(topics2);
		
		}

	public void updateCourse(int id, Courses course) 
	{
	
		courserepo.save(course);
		
		}
	public void deleteTopics(int id, Topics topics2) {
		// TODO Auto-generated method stub
		//for(int i=0;i<= topics.size();i++)
		/*{
			System.out.println("Size of i"+i);
			System.out.println("value of i"+topics.get(i));
			Topics t = topics.get(i);
			System.out.println("t.getA()"+t.getA());
			System.out.println("id"+id);
			System.out.println("id"+topics2);
			if(t.getA()==id)
			{
				System.out.println(+t.getA()+"=="+id);
				topics.remove(i);
				return;
			}
			
		}*/
			
			crdrepo.delete(topics2);
	}

	public void deleteCourses(int id, Courses course2)
	{
					
			courserepo.delete(course2);
	}
	
	
	private void add(Object object1) {
	}

	private void add(Courses courses1) {
	}
		
	}
	
