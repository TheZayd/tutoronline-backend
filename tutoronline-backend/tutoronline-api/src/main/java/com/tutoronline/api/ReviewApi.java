package com.tutoronline.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ReviewApi {
    @GetMapping(value = "/api/v1/reviews")
    public TutorReview api(){
        TutorReview tutorReview = new TutorReview(
                "John West",
                "john.png",
                135,
                "TutorOnline has helped me to achieve my results",
                5
        );
        return tutorReview;
    }
}
