package toko;
//inhretance (pewarisan)

public class kelasCD extends product {
    private String artist;
    private int numSong;
    private String label;

    public kelasCD() {
        super(); //
        artist = "";
        numSong = 0;
        label = "";
    }

    public String getArtis() {
        return this.artist;
    }

    public void setArtis(String artis) {
        this.artist = artis;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

public void print() {
    super.print();
    System.out.println("artist\t" + artist);
    System.out.println("numSong\t" + numSong);
    System.out.println("label\t" + label);

}

    
}
