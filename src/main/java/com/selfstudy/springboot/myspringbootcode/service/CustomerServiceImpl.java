package com.selfstudy.springboot.myspringbootcode.service;

import java.util.List;

import com.selfstudy.springboot.myspringbootcode.model.customer.Customer;
import com.selfstudy.springboot.myspringbootcode.model.customer.CutomerRepositoryI;
import com.selfstudy.springboot.myspringbootcode.nosql_model.feedback.Feedback;
import com.selfstudy.springboot.myspringbootcode.nosql_model.feedback.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl{

    @Autowired
    private CutomerRepositoryI customerRepo;

    @Autowired
    private FeedbackRepository feedbackRepo;

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }
	public List<Feedback> getCustFeedbacks(Integer customerId) {
		return feedbackRepo.findByCustomerId(customerId);
	}
	public Feedback postFeedback(Feedback fb, int customerId) {
        fb.setCustomerId(customerId);
		return feedbackRepo.save(fb);
	}
    
}