package CompositeDesignPattern.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory  = new Directory("movies");
        File border = new File("border");
        movieDirectory.add(border);

        Directory marathiMovies = new Directory("Marathi Movies");
        movieDirectory.add(marathiMovies);

        File boyz = new File("boyz");
        marathiMovies.add(boyz);

        movieDirectory.ls();
    }
}
