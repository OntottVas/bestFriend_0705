public class BestFriend {
    public static void main(String[] args) {
        Person imi = new Person("Imre", 2000);
        Person belus = new Person("Bela", 2001);
        imi.setBestFriend(belus);

        System.out.println(belus);
        System.out.println(imi);

        System.out.println(imi.ageDifference());
        System.out.println(belus.ageDifference());

        Person ger = new Person("Geri", 1994);
        Person bandi = new Person("András", 1980);
        Person pisti = new Person("István", 1973);

        belus.setBestFriend(ger);
        ger.setBestFriend(bandi);
        bandi.setBestFriend(pisti);

        imi.printFriendChain();
    }


}
