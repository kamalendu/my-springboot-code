package com.selfstudy.springboot.myspringbootcode.nosql_model.feedback;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback,String>{

	List<Feedback> findByCustomerId(Integer customerId);

}