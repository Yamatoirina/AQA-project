package hometask_JavaCore04;

public abstract class Bird {

    public String feathers;
    public String eggs;

    public Bird() {
    }

    public Bird(String feathers, String eggs) {
        this.feathers = feathers;
        this.eggs = eggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }


    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", eggs='" + eggs + '\'' +
                '}';
    }

}
