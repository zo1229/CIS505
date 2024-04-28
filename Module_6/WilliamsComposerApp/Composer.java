/*Williams, A., (2024).  CIS 505 Intermediate Java Programming.  Bellevue University.*/
package Module_6.WilliamsComposerApp;

public class Composer {
    private int id;
    private String name;
    private String genre;

    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // Accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Composer ID: " + id + "\nName: " + name + "\nGenre: " + genre;
    }
}
