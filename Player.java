package com.tka.july30;

public class Player {
	
	private int jn;
	private String name;
	private int runs;
	private int wickets;
	private String tName;
	
	Player()
	{
		
	}
	
	public Player(int jn, String name, int runs, int wickets, String tName) {
		super();
		this.jn = jn;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tName = tName;
	}
	
	
	public int getJn() {
		return jn;
	}
	public void setJn(int jn) {
		this.jn = jn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
	@Override
	public String toString() {
		return "Player [jn=" + jn + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", tName=" + tName
				+ "]";
	}

}
