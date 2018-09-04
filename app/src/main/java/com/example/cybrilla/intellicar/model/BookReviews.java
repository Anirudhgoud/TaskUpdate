package com.example.cybrilla.intellicar.model;

public class BookReviews {

    private String mReviewerName;
    private String mReview;
    private String mBookName;

    private String reviewRating;

    public BookReviews(String bookName, String review, String reviewerName, String rating) {
        mBookName = bookName;
        mReview = review;
        mReviewerName = reviewerName;
        reviewRating = rating;
    }

    public String getmReviewerName() {
        return mReviewerName;
    }

    public void setmReviewerName(String mReviewerName) {
        this.mReviewerName = mReviewerName;
    }

    public String getmReview() {
        return mReview;
    }

    public void setmReview(String mReview) {
        this.mReview = mReview;
    }

    public String getmBookName() {
        return mBookName;
    }

    public void setmBookName(String mBookName) {
        this.mBookName = mBookName;
    }

    public String getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(String reviewRating) {
        this.reviewRating = reviewRating;
    }
}
