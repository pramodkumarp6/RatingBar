package com.example.ratingbar;

import android.widget.RatingBar;

import androidx.databinding.BindingAdapter;

public class Users {
    private String ratingbar;

    public String getRatingbar() {
        return ratingbar;
    }

    public void setRatingbar(String ratingbar) {
        this.ratingbar = ratingbar;
    }

    @BindingAdapter("android:rating")
    public static void setRating(RatingBar view, String ratingbar) {

        if (view!=null)
        {

            float rate= Float.parseFloat(ratingbar);

            view.setRating(rate);

        }
    }
}
