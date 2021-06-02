package com.tutoronline.api;

public class TutorReview {
    private String name;
    private String pathToPicture;
    private int lessons;
    private String review;
    private int stars;
    private String subject;

    public TutorReview(String name, String pathToPicture, int lessons, String review, int stars, String subject) {
        this.name = name;
        this.pathToPicture = pathToPicture;
        this.lessons = lessons;
        this.review = review;
        this.stars = stars;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathToPicture() {
        return pathToPicture;
    }

    public void setPathToPicture(String pathToPicture) {
        this.pathToPicture = pathToPicture;
    }

    public int getLessons() {
        return lessons;
    }

    public void setLessons(int lessons) {
        this.lessons = lessons;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TutorReview{" +
                "name='" + name + '\'' +
                ", pathToPicture='" + pathToPicture + '\'' +
                ", lessons=" + lessons +
                ", review='" + review + '\'' +
                ", stars=" + stars +
                ", subject='" + subject + '\'' +
                '}';
    }
}
