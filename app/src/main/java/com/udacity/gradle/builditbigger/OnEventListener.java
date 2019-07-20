package com.udacity.gradle.builditbigger;

public interface OnEventListener<T> {
    void onSuccess(T result);
    void onFailure(String exceptionMessage);
}
