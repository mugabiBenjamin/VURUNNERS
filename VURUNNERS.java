/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.vurunners;

/**
 *
 * @author Benjn
 */
public class VURUNNERS {

    static class Runner {
        String name;
        int time;

        Runner(String name, int time) {
            this.name = name;
            this.time = time;
        }
    }

    // Method to find and print the fastest and second fastest runners
    public static void findFastestRunners(Runner[] runners) {
        if (runners.length < 2) {
            System.out.println("Not enough runners to determine the fastest and second fastest.");
            return;
        }

        Runner fastest = null;
        Runner secondFastest = null;

        for (Runner runner : runners) {
            if (fastest == null || runner.time < fastest.time) {
                secondFastest = fastest;
                fastest = runner;
            } else if (secondFastest == null || runner.time < secondFastest.time) {
                secondFastest = runner;
            }
        }

        if (fastest != null) {
            System.out.println("Fastest runner: " + fastest.name + " with time " + fastest.time + " minutes.");
        }

        if (secondFastest != null) {
            System.out.println("Second fastest runner: " + secondFastest.name + " with time " + secondFastest.time + " minutes.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Array of runners
        Runner[] runners = {
            new Runner("Elena", 341),
            new Runner("Thomas", 273),
            new Runner("Hamilton", 278),
            new Runner("Suzie", 329),
            new Runner("Phil", 445),
            new Runner("Matt", 402),
            new Runner("Alex", 388),
            new Runner("Emma", 275),
            new Runner("John", 243),
            new Runner("James", 334),
            new Runner("Jane", 412),
            new Runner("Emily", 393),
            new Runner("Daniel", 299),
            new Runner("Neda", 343),
            new Runner("Aaron", 317),
            new Runner("Kate", 265)
        };

        // Find and print the fastest and second fastest runners
        findFastestRunners(runners);
    }
}
