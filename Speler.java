package vesters.jarne.taak.herexamen;



/**
 *
 * @author jarne
 */
public class Speler {
    
private int x; // x-positie geselecteerd vak
    private int y; // y-positie geselecteerd vak
    private String name;
    private Schijf huidigeSchijf;

    public Speler() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schijf getCurrentDisc() {
        return huidigeSchijf;
    }

    public void setCurrentDisc(Schijf huidigeSchijf) {
        this.huidigeSchijf = huidigeSchijf;
    }
}
