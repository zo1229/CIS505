package CIS505.Module_2.WilliamsTeamApp;

import java.util.Scanner;

public class WilliamsTeamApp 
{
    private String teamName = "";
    private String[] players = new String[20];
    private int playerCount = 0;

    public WilliamsTeamApp(String teamName) 
    {
        this.teamName = teamName;
    }

    public void addPlayer(String playerName) 
    {
        players[playerCount] = playerName;
        playerCount++;
    }

    public String[] getPlayers() 
    {
        return players;
    }

    public int getPlayerCount() 
    {
        return playerCount;
    }

    public String getTeamName() 
    {
        return teamName;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the team name: ");
            String teamName = scanner.nextLine();
            WilliamsTeamApp team = new WilliamsTeamApp(teamName);

            System.out.print("Enter player names separated by commas (no spaces): ");
            String[] playerNames = scanner.nextLine().split(",");
            for (String playerName : playerNames) 
            {
                team.addPlayer(playerName);
            }

            System.out.println("Number of players in team " + team.getPlayerCount());
            System.out.print("Players on team: ");
            for (int i = 0; i < team.getPlayerCount(); i++) 
            {
                System.out.print(team.getPlayers()[i]);
                if (i != team.getPlayerCount() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) 
            {
                break;
            }
        }

        // Team summary based on the number of players
        if (scanner != null) {
            scanner.close();
        }
        System.out.println("Program ended.");
    }
}
