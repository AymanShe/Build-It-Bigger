package com.udacity.gradle.builditbigger.Services;

import android.test.AndroidTestCase;
import com.udacity.gradle.builditbigger.OnEventListener;
import org.junit.Test;

public class EndpointsAsyncTaskTest extends AndroidTestCase {

    @Test
    public void testTellJoke() {
        EndpointsAsyncTask testTask = new EndpointsAsyncTask(new OnEventListener<String>() {
            @Override
            public void onSuccess(String object) {
                assertNotNull(object);
            }

            @Override
            public void onFailure(String exceptionMessage) {
                assertNotNull(exceptionMessage);
            }
        });
        testTask.execute();
    }
}