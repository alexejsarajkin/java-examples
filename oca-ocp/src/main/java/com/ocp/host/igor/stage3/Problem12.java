package com.ocp.host.igor.stage3;

interface Laughable {
    Joke crackJoke(String joke);
}

public class Problem12 {
    public static void main(String[] args) {
        Laughable laughable = new Laughable() {
            @Override
            public Joke crackJoke(String joke) {
                return new Joke(joke);
            }
        };

        Laughable laughable1 = (joke) -> new Joke(joke);

        Laughable joker = Joke::new;
        Joke oneMore = joker.crackJoke("MyJoke");
    }
}

class Joke {
    private String joke;

    public Joke(String joke) {
        this.joke = joke;
    }
}
