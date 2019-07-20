package com.udacity.gradle.builditbigger;

public interface OnEventListener<T> {
    void onSuccess(T object);
    void onFailure(String exceptionMessage);
}
