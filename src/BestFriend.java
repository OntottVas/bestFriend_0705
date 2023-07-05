public class BestFriend {
    public static void main(String[] args) {
        Person imi = new Person("Imre", 2000);
        Person belus = new Person("Bela", 2001);
        imi.setBestFriend(belus);

        System.out.println(belus);
        System.out.println(imi);

        System.out.println(imi.ageDifference());
        System.out.println(belus.ageDifference());
    }


}
