import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       Player player1 = new Player("Cat");
       player1.addSport("tennis");
       player1.addSport("hockey");
       player1.addSport("badminton");

       Player player2 = new Player("Built Diffirent");
       player2.addSport("soccer");
       player2.addSport("dodgeball");
       player2.addSport("basketball");

       Player player3 = new Player("Dawg");
       player3.addSport("tennis");
       player3.addSport("soccer");
       player3.addSport("badminton");


       Player player4 = new Player("Elizabeth");
       player4.addSport("basketball");
       player4.addSport("hockey");
       player4.addSport("dodgeball");

       ArrayList<Player> players = new ArrayList<>();
       players.add(player1);
       players.add(player2);
       players.add(player3);
       players.add(player4);

       String [] listofSports = {"tennis", "soccer","badminton","basketball","hockey","dodgeball"};

       for(String sport: listofSports)
       {
        for(Player player:players ){
            ArrayList<String> sports = player.getSports();
            if(sports.contains(sport))
            {
                System.out.println(player.name + " plays " + sport);
            }
        }

       }
       
}
}
