public class FootballPlayer {

    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;

    public void play(int minutesToPlay){
        minutes = minutes + minutesToPlay;


    }

    public void score(int goals){
        numberOfGoals = numberOfGoals+goals;

    }
}
