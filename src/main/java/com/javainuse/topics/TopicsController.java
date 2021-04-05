package com.javainuse.topics;

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
public class TopicsController {

	@Autowired
	private BusinessService bs;
	
	@RequestMapping("/")
	public String home()
	{
	return("<h1>Welcome</h1>");	
	}
	
	@RequestMapping("/Topics")
	public List<Topics> getAllTopics()
	{
	 	 return bs.getAllTopics();
			 
			 //new Topics() 
	}
	
		
	@RequestMapping("/Topics/{id}")
	public Optional<Topics> getAllTopicsById(@PathVariable int id)
	{
	//return("<h1>Welcome</h1>");
	return bs.getTopicsByID(id)	;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Topics")
	public void addTopics(@RequestBody Topics topics)
	{
	//return("<h1>Welcome</h1>");
	  bs.addTopics(topics);	
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Topics/{id}")
	public void updateTopics(@RequestBody Topics topics, @PathVariable int id)
	{
	//return("<h1>Welcome</h1>");
	  bs.updateTopics(id,topics);	
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/Topics/{id}")
	public void deleteTopics(@RequestBody Topics topics, @PathVariable int id)
	{
	//return("<h1>Welcome</h1>");
	  bs.deleteTopics(id,topics);	
	}
}

