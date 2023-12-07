import Model.Player;

import java.util.Scanner;

public class CreatePlayerMonster {

    DBConnection dbConnection = new DBConnection();


    public void createPlayer() {

        dbConnection.open();
        Player newPlayer = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter players name");
        String playerName = scanner.nextLine();
        System.out.println("Enter health");
        int playerHealth = scanner.nextInt();

        newPlayer.setName(playerName);
        newPlayer.setHealth(playerHealth);

        System.out.println("Player created with id: " + dbConnection.createPlayer(newPlayer));
        dbConnection.closeConnection();

    }


}
