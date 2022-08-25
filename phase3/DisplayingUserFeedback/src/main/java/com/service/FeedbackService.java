package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Feedback;
import com.dao.FeedbackDao;
@Service
public class FeedbackService {
@Autowired
FeedbackDao feedbackDao;
public String storeFeedback(Feedback fb) {
	if(feedbackDao.storeFeedback(fb)>0) {
		return "Feedback stored";
	}else {
		return "Feedback didn't store";
	}
}

public List<Feedback> getAllFeedback(){
	return feedbackDao.getAllFeedbackDetails();
}
}
