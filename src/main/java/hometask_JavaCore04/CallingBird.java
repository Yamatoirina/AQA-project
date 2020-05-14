package hometask_JavaCore04;

public class CallingBird {
    public static void main(String[] args) {
        Eagle eagle= new Eagle("brown", "two");
        Swallow swallow = new Swallow("grey", "many");
        Penguin penguin= new Penguin("black-and-white", "in winter");
        Kiwi kiwi = new Kiwi("bright", "unknown, sorry");
        System.out.println(eagle);
        System.out.println(swallow);
        System.out.println(penguin);
        System.out.println(kiwi);
    }
}
