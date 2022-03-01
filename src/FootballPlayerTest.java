public class FootballPlayerTest {


    public static void main(String[] args) {

        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.inPlay = true;
        alex.minutes = 0;
        alex.numberOfGoals = 0;

        alex.play(90);
        alex.score(3);
        alex.score(1);


        System.out.println("Number Of Goals Alex Scored :"+alex.numberOfGoals);
        System.out.println("Alex Played Totally :"+alex.minutes+" Minutes So Far");

        alex.play(60);
        alex.score(0);
        alex.score(2);

        System.out.println("Number Of Goals Alex Scored :"+alex.numberOfGoals);
        System.out.println("Alex Played Totally :"+alex.minutes+" Minutes So Far");


        System.out.println("*********************************************");


        FootballPlayer oguzhan = new FootballPlayer();
        oguzhan.no = 10;
        oguzhan.name = "oguzhan";
        oguzhan.inPlay = true;
        oguzhan.minutes = 0;
        oguzhan.numberOfGoals = 0;

        oguzhan.play(90);
        oguzhan.score(1);
        oguzhan.score(3);


        System.out.println("Number Of Goals oguzhan Scored :"+oguzhan.numberOfGoals);
        System.out.println("oguzhan Played Totally :"+oguzhan.minutes+" Minutes So Far");



    }

}
