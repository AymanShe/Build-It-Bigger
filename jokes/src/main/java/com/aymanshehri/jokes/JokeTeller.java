package com.aymanshehri.jokes;

import java.util.Random;

public class JokeTeller {

    private String[] jokes;
    private Random random;

    public JokeTeller() {
        random = new Random();
        jokes = new String[4];
        jokes[0] = "A ChaCha walks into a bar. The bartender asks, \"What will it be?\". \"I'm sorry\", says the ChaCha, \"I'm already full";
        jokes[1] = "A pregnant fragment walks into a bar. The bartender says, \"Whoa! Whoa! We don't support nested fragments here!";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
        jokes[3] = "A fragment walks into a bar and says, \"I'm lost. Can I please speak to the FragmentManager?";
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
