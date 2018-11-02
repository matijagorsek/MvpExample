package com.example.matija.mvp.ui;

import com.example.matija.mvp.models.MovieResponse;

public interface MainViewInterface {

    void showToast(String s);
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);
}
