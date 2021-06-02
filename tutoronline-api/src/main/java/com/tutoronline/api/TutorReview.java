package com.tutoronline.api;

public class TutorReview {
    private String name;
    private String pathToPicture;
    private int lessons;
    private String review;
    private int stars;

    public TutorReview(String name, String pathToPicture, int lessons, String review, int stars) {
        this.name = name;
        this.pathToPicture = pathToPicture;
        this.lessons = lessons;
        this.review = review;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public String getPathToPicture() {
        return pathToPicture;
    }

    public int getLessons() {
        return lessons;
    }

    public String getReview() {
        return review;
    }

    public int getStars() {
        return stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPathToPicture(String pathToPicture) {
        this.pathToPicture = pathToPicture;
    }

    public void setLessons(int lessons) {
        this.lessons = lessons;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "TutorReview{" +
                "name='" + name + '\'' +
                ", pathToPicture='" + pathToPicture + '\'' +
                ", lessons=" + lessons +
                ", review='" + review + '\'' +
                ", stars=" + stars +
                '}';
    }
}
