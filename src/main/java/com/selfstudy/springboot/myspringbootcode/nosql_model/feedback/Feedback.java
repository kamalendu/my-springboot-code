package com.selfstudy.springboot.myspringbootcode.nosql_model.feedback;

import java.util.List;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Feedback{
    @Id
    String id;
    Integer customerId;
    String feedbackText;
    List<Feedback> replies;

}