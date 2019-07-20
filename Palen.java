package vesters.jarne.taak.herexamen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jarne
 */
public class Palen {
  private final int xPositie;
  private final int yPositie;
  private int hoogte;
  
  public Palen(int xPositie, int yPositie) {
      this.xPositie = xPositie;
      this.yPositie = yPositie;
  }
  
  public int getxPositie() {
      return xPositie;
  }
  
  public int getyPositie() {
      return yPositie;
  }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }
  
}