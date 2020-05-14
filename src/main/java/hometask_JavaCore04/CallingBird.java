package hometask_JavaCore04;

public class CallingBird {
    public static void main(String[] args) {
        Bird eagle= new Eagle("brown", "two");
        Bird swallow = new Swallow("grey", "many");
        Bird penguin= new Penguin("black-and-white", "in winter");
        Bird kiwi = new Kiwi("bright", "unknown, sorry");
        System.out.println(eagle);
        System.out.println(swallow);
        System.out.println(penguin);
        System.out.println(kiwi);
    }
}
