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
public class Spelbord{
   private int breedte;
   private int hoogte;
   private boolean isBezet;
   
   public Spelbord(int breedte, int hoogte) {
       this.breedte = breedte;
       this.hoogte = hoogte;
       isBezet = false;
   }
   
   public int getBreedte() {
       return breedte;
   }

    public int getHoogte() {
        return hoogte;
    }

    public boolean getIsBezet() {
        return isBezet;
    }

    public void setIsBezet(boolean Bezet) {
        isBezet = Bezet;
    }
    public void reset() { //TODO
        
        
    }
}
