package movies;

public class Movie {
    private String name;
    private String category;

//CONSTRUCTOR:
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
//GETTERS:
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
//SETTERS:
    public void setName(){
        this.name = name;
    }
    public void setCategory(){
        this.category = category;
    }
}