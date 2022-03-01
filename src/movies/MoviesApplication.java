package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        movieSelection();
    }
    public static void movieSelection() {
        Input userInput = new Input();
        Movie[] movies = MoviesArray.findAll();
        while (true) {
            String userChoice = userInput.getString("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");
            switch (userChoice) {
                case "0":
                    System.out.println("Exiting...");
                    return;
                case "1":
                    System.out.println("All Films: ");
                    for (Movie movie : movies) {
                        System.out.println(movie.getName()+" "+"--"+" "+movie.getCategory());
                    }
                    break;
                case "2":
                    System.out.println("Animated: ");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case "3":
                    System.out.println("Drama: ");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case "4":
                    System.out.println("Horror: ");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case "5":
                    System.out.println("Sci-fi: ");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                default:
                    System.out.println("Enter selection between 1 and 5.\n");
            }
        }
    }
}
