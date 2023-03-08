package pro.sky.receptapp.model;

public class ingredient {
    private String title;
    private int number;
    private String measure;

    public ingredient(String title, int number, String measure) {
        this.title = title;
        this.number = number;
        this.measure = measure;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
