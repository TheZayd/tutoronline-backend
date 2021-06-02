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
                "https://i.ibb.co/6Nxjz59/tutor.jpg",
                135,
                "TutorOnline has helped me to achieve my results",
                5,
                "A-Level History and English"
        );

        TutorReview steveNorthReview = new TutorReview(
                "Steve North",
                "https://lh3.googleusercontent.com/proxy/evHiiYN0ymXsKIYtFDTymHepjmDYcwB6xEb0mdFlm5iDhpOBcGDwlyvHhxPAnBZ-If1xh6LUNyxHrKCDO0XK1EK1",
                225,
                "TutorOnline helped me to connect with the right students",
                5,
                "GCSE Maths and Physics"
        );

        TutorReview julieEastReview = new TutorReview(
                "Julie East",
                "https://www.superprof.co.in/images/teachers/teacher-home-experienced-native-female-english-teacher-looking-tutor-manchester-spanish-speaker.jpg",
                95,
                "TutorOnline was a good platform but had some small issues",
                4,
                "A-Level Economics and Politics"
        );

        TutorReview shaniceSouthReview = new TutorReview(
                "Shanice South",
                "https://m.media-amazon.com/images/M/MV5BOTQ2MWMwMGUtOWVkMi00OTdlLWEzZTMtYTU0MGIwODU1OGE3XkEyXkFqcGdeQXVyNTYwNzgwNjk@._V1_UY317_CR17,0,214,317_AL_.jpg",
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
