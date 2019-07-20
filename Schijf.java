/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vesters.jarne.taak.herexamen;

/**
 *
 * @author jarne
 */
class Schijf {
    private int straal;
    private int xPositie;
    private int yPositie;
    private Color color;
    private int aantalStappen;
    
    public Schijf(int straal) {
        this.straal = straal;
        xPositie = 0;
        yPositie = 0;
    }
    
    public int getStraal() {
        return straal;
    }
    public void setStraal(int straal) {
        this.straal = straal;
    }

    public int getxPositie() {
        return xPositie;
    }

    public int getyPositie() {
        return yPositie;
    }

    public Color getColor() {
        return color;
    }
    public void setxPositie(int xPositie) {
        this.xPositie = xPositie;
    }

    public void setyPositie(int yPositie) {
        this.yPositie = yPositie;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
