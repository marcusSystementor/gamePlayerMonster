public class Main {
    public static void main(String[] args) {

        DBConnection db = new DBConnection();
        db.open();
        CreatePlayerMonster cr =  new CreatePlayerMonster();
        cr.createPlayer();

    }
}