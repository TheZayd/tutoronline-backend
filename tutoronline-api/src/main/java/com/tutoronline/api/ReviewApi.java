package com.tutoronline.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ReviewApi {
    @GetMapping(value = "/api/v1/reviews")
    public TutorReview api(){
        TutorReview johnWestReview = new TutorReview(
                "John West",
                "https://ibb.co/t2LvkDP",
                135,
                "TutorOnline has helped me to easily connect with students on a regular basis.",
                5,
                "A-Level History and English"
        );

        TutorReview steveNorthReview = new TutorReview(
                "Steve North",
                "https://ibb.co/hcXG3Tk",
                225,
                "TutorOnline helped me to raise my grade quickly.",
                5,
                "GCSE Maths and Physics"
        );

        TutorReview julieEastReview = new TutorReview(
                "Julie East",
                "https://ibb.co/26bD2Tr",
                95,
                "TutorOnline was a good platform but customer service wasn't always available.LATROD",
                4,
                "A-Level Economics and Politics"
        );

        TutorReview shaniceSouthReview = new TutorReview(
                "Shanice South",
                "https://ibb.co/Gsfs29b",
                270,
                "TutorOnline gave me the feedback I needed to improve as a teacher",
                5,
                "GCSE English Literature"
        );

        double randomPercentage = Math.random();

        if (randomPercentage > 0 && randomPercentage < 0.25) {
            return steveNorthReview;
        } else if (randomPercentage > 0.25 && randomPercentage < 0.5) {
            return johnWestReview;
        } else if (randomPercentage > 0.5 && randomPercentage < 0.75) {
            return julieEastReview;
        } else {
            return shaniceSouthReview;
        }
    }
}
