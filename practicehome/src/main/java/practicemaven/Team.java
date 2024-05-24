package practicemaven;

public class Team{
	
	public Team(String team, Player player) {
		super();
		this.team = team;
		this.player = player;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	private String team;
	private Player player;
}
