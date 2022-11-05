
public class login {
    private int lama;
    private int biaya;

    public login(){
        this.lama=lama;
        this.biaya=biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int lama,int biaya) {
        this.biaya = biaya*lama;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

}
