public class Main {
    public static void main(String[] args) {

        DBConnection db = new DBConnection();
        db.open();
        CreatePlayerMonster cr =  new CreatePlayerMonster();
       // cr.createPlayer();

        String playerName = db.getPlayerWithId(3);
        System.out.println(playerName);

    }
}