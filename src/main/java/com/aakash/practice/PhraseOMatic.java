package com.aakash.practice;

public class PhraseOMatic {

    public static void main(String[] args) {

        // Step 1: Create three sets of words to choose from

        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven"};

        String[] wordListThree = {"framework", "library", "DSL", "REST API"};

        // Step 2: Find out how many words are in each list

        int oneLength = wordListOne.length;

        int twoLength = wordListTwo.length;

        int threeLength = wordListThree.length;

        // Step 3: Generate three random numbers

        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLength);

        int rand2 = randomGenerator.nextInt(twoLength);

        int rand3 = randomGenerator.nextInt(threeLength);

        // Step 4: Build a phrase by picking one word from each list

        String phrase = wordListOne[rand1] + " " +

                wordListTwo[rand2] + " " +

                wordListThree[rand3];

        // Step 5: Print the phrase

        System.out.println("What we need is a " + phrase);

    }

}


