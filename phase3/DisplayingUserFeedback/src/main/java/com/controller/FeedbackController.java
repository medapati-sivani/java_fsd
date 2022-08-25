package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Feedback;
import com.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	// http://localhost:8080/feedbacksFromDb
	@RequestMapping(value = "feedbacksFromDb",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Feedback> getAllEmployeeDetailsFromDb() {
			return feedbackService.getAllFeedback();
	}
	
	
	// http://localhost:8080/storeFeedback
	@RequestMapping(value = "storeFeedback",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeEmployee(@RequestBody Feedback fb) {		// scan the value from reqeust body in the form json 
		return feedbackService.storeFeedback(fb);
	}
	
}
