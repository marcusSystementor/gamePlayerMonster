public class Game {

    DBConnection dbConnection = new DBConnection();

    public void updatePlayerHealth(int health, int id) {
        dbConnection.open();
        dbConnection.updatePlayerHealth(health, id);


    }
}
