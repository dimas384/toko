package toko;

public class DVD {
    private String rating;
    private int lenght;
    private String studio;

    public DVD() {
        rating = "";
        lenght = 0;
        studio = "";
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public void print() {
        System.out.println("Lenght\t: " + lenght);
        System.out.println("Rating\t: " + rating);
        System.out.println("Studio\t: " + studio);

    }

    
    }


   
    

