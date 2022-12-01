
package comm.bentuk;

import comm.Base.Bangundatar;
public class Persegi implements Bangundatar {
     int panjang;
    int lebar;

    public Persegi (int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar; 
    }

    @Override
    public void tampilluas(){
        System.out.println("luas persegi: " + luas());
    }

    @Override
    public int panjang() {
        return this.panjang;
    }

    @Override
    public int lebar() {
        return this.lebar;
    }

    @Override
    public double luas(){
        return panjang * lebar;
    }
    
}
