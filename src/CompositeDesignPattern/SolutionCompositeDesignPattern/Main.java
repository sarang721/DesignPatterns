package CompositeDesignPattern.SolutionCompositeDesignPattern;

import CompositeDesignPattern.SolutionCompositeDesignPattern.Directory;

public class Main {
    public static void main(String[] args) {

        Directory moviesDirectiory = new Directory("Movies");
        Directory hindiMovies = new Directory("Hindi Movies");
        Directory englishMovies = new Directory("English Movies");

        moviesDirectiory.add(hindiMovies);
        moviesDirectiory.add(englishMovies);
        File pk = new File("pk");
        File dhoom = new File("dhoom");
        File krrish = new File("krrish");
        File missionImpossible = new File("MI1");
        hindiMovies.add(pk);
        hindiMovies.add(dhoom);
        hindiMovies.add(krrish);
        englishMovies.add(missionImpossible);

        moviesDirectiory.ls();

    }
}
