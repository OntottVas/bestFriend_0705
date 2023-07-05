public class Person {
    private String name;
    private final int birthYear;
    private Person bestFriend;


    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(Person bestFriend) {
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", bestFriend=" + (bestFriend == null ? "4EvaAlone" : bestFriend.getName()) +
                '}';
    }

    public int ageDifference() {
        try {
            return Math.abs(this.birthYear - this.bestFriend.getBirthYear());
                    /*this.birthYear < this.bestFriend.getBirthYear() ?
                    this.bestFriend.getBirthYear() - this.birthYear :
                    this.birthYear - this.bestFriend.getBirthYear();*/
        } catch (NullPointerException e) {
            System.out.println("Loosers don't have friends...");
            return -1;
        }
    }

    public void printFriendChain() {
        if(bestFriend == null) {
            System.out.println(this.name + ": alone for the end of time");
        } else {
            System.out.println(this.name + ": " + this.bestFriend.name);
            this.bestFriend.printFriendChain();
        }
    }

    public int ageDiff() throws ForeverAloneException {
        return 0;
    }
}
