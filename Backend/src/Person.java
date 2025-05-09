public class Person {
    private String ad;
    private int yas;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void showInfo()
    {
        System.out.print(ad+" "+yas);
    }

}
