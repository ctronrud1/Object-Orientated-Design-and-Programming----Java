 // ************************************************************ 
// File Name: Task1_ComparePlayers
// Author: Charlie Tronrud
// Purpose:  Holds information about an athlete: name, team, anduniform numbe contains a skeletal program that uses the Player
// ************************************************************

public class Task1_Player {
    private String name;
    private String team;
    private int uniformNumber;

    public Task1_Player() {
        name = "";
        team = "";
        uniformNumber = 0;
    }

    public Task1_Player(String name, String team, int uniformNumber) {
        this.name = name;
        this.team = team;
        this.uniformNumber = uniformNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(int uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Task1_Player)) {
            return false;
        }

        Task1_Player player = (Task1_Player) obj;

        return team.equals(player.team) && uniformNumber == player.uniformNumber;
    }
}
