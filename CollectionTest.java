package com.tka.july30;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
        ArrayList <Player> RCB = new ArrayList<Player>();
		
		RCB.add(new Player(18,"Virat Kohli", 6000, 0, "RCB"));
		RCB.add(new Player(97,"Rajat Patidar", 3000, 5, "RCB"));
		RCB.add(new Player(25,"Krunal Pandya", 3000, 10, "RCB"));
		RCB.add(new Player(61,"Phil Salt", 5000, 10, "RCB"));
		RCB.add(new Player(06,"Jitesh Sharma", 3000, 7 , "RCB"));
		RCB.add(new Player(99,"Swastik C.", 4000, 10, "RCB"));
		RCB.add(new Player(43,"Tim Seifert", 2000, 20, "RCB"));
		RCB.add(new Player(16,"Mayank Agrawal", 900, 9, "RCB"));
		RCB.add(new Player(27,"Liam L.    ", 2000, 6, "RCB"));
		RCB.add(new Player(16,"Tim David", 1000, 5, "RCB"));
		RCB.add(new Player(28,"Manoj Bhandage", 700, 8, "RCB"));
	
		//System.out.println(RCB.size());
		System.out.println("\t ROYAL CHALLENGERS BENGLURU");
		for(Player p : RCB)
		{
			System.out.print(p.getJn() + "\t"+p.getName() + "\t"+p.getRuns() + "\t"+p.getWickets() + "\t"+p.gettName()+"\n");
		}
		
		System.out.println("\n\nPlayers having more than 2000 Runs.");
		for(Player p : RCB)
		{
			if(p.getRuns()>2000)
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers having less than 6 wickets.");
		for(Player p : RCB)
		{
			if(p.getWickets()<6)
			System.out.println(p);
		}
	
		System.out.println("\n\nPlayers having \"r\" in their names.");
		for(Player p : RCB)
		{
			if(p.getName().contains("r"))
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers name starts with P.");
		for(Player p : RCB)
		{
			if(p.getName().startsWith("P"))
			System.out.println(p);
		}
		System.out.println("\n");
		
		
		List <Player> PBKS = new ArrayList<Player>();
		
		PBKS.add(new Player(96, "Shreyas Iyer", 604, 0, "Punjab Kings"));
		PBKS.add(new Player(10, "Prabhsimran S.", 599, 0, "Punjab Kings"));
		PBKS.add(new Player(18, "Shashank Singh", 350, 1, "Punjab Kings"));
		PBKS.add(new Player(33, "Marcus Stoinis", 160, 4, "Punjab Kings"));
		PBKS.add(new Player(7, "Josh Inglis", 278, 0, "Punjab Kings"));
		PBKS.add(new Player(21, "Nehal Wadhera", 369, 0, "Punjab Kings"));
		PBKS.add(new Player(24, "Priyansh Arya", 545, 1, "Punjab Kings"));
		PBKS.add(new Player(17, "Arshdeep Singh", 10, 8, "Punjab Kings"));
		PBKS.add(new Player(3, "Yuzvendra C.", 5, 6, "Punjab Kings"));
		PBKS.add(new Player(19, "Marco Jansen", 75, 6, "Punjab Kings"));
		PBKS.add(new Player(13, "Azmatullah O", 57, 7, "Punjab Kings"));
		
        System.out.println("\t\t PUNJAB KINGS");
        for(Player p : PBKS)
		{
			System.out.print(p.getJn() + "\t"+p.getName() + "\t"+p.getRuns() + "\t"+p.getWickets() + "\t"+p.gettName()+"\n");
		}
        
        System.out.println("\n\nPlayers having more than 200 Runs.");
		for(Player p : PBKS)
		{
			if(p.getRuns()>200)
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers having less than 6 wickets.");
		for(Player p : PBKS)
		{
			if(p.getWickets()<6)
			System.out.println(p);
		}
	
		System.out.println("\n\nPlayers having \"r\" in their names.");
		for(Player p : PBKS)
		{
			if(p.getName().contains("r"))
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers name starts with P.");
		for(Player p : PBKS)
		{
			if(p.getName().startsWith("P"))
			System.out.println(p);
		}
        System.out.println("\n");
        

        List <Player> MI = new ArrayList<>();
        
	    MI.add(new Player(63, "Suryakumar Y.",   717,  0, "Mumbai Indians"));
	    MI.add(new Player(18, "Trent Boult",    0, 22, "Mumbai Indians"));
	    MI.add(new Player(93, "Jasprit Bumrah",      0, 18, "Mumbai Indians"));
	    MI.add( new Player(45, "Rohit Sharma",       418,  0, "Mumbai Indians"));
	    MI.add(new Player(44, "Ryan Rickelton",     388,  0, "Mumbai Indians"));
	    MI.add(new Player(9,  "Tilak Varma",        343,  0, "Mumbai Indians"));
	    MI.add(new Player(19, "Naman Dhir",         252,  0, "Mumbai Indians"));
	    MI.add( new Player(33, "Hardik Pandya",      224, 14, "Mumbai Indians"));
	    MI.add(new Player(22, "Will Jacks",         233,  6, "Mumbai Indians"));
	    MI.add(new Player(74, "Mitchell S.",     40, 10, "Mumbai Indians"));
	    MI.add(new Player(56, "Deepak Chahar",        37, 11, "Mumbai Indians"));
	    
	    System.out.println("\t ROYAL CHALLENGERS BENGLURU");
	    for(Player p : MI)
		{
			System.out.print(p.getJn() + "\t"+p.getName() + "\t"+p.getRuns() + "\t"+p.getWickets() + "\t"+p.gettName()+"\n");
		}
	    
	    System.out.println("\n\nPlayers having more than 200 Runs.");
		for(Player p : MI)
		{
			if(p.getRuns()>200)
			System.out.println(p);
			
		}
		System.out.println("\n\nPlayers having less than 6 wickets.");
		for(Player p : MI)
		{
			if(p.getWickets()<6)
			System.out.println(p);
		}
	
		System.out.println("\n\nPlayers having \"r\" in their names.");
		for(Player p : MI)
		{
			if(p.getName().contains("r"))
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers name starts with P.");
		for(Player p : MI)
		{
			if(p.getName().startsWith("P"))
			System.out.println(p);
		}
		 System.out.println("\n");
		 
		 
	
        List <Player> GT = new ArrayList<>();
        
        GT.add(new Player(7,  "Shubman Gill",         650,  0, "Gujarat Titans"));
        GT.add(new Player(23, "Sai Sudharsan",        759,  3, "Gujarat Titans"));
        GT.add(new Player(35, "Shahrukh Khan",        179,  1, "Gujarat Titans"));
        GT.add(new Player(19, "Rashid Khan",           40,  9, "Gujarat Titans"));
        GT.add(new Player(63, "Jos Buttler",          538,  0, "Gujarat Titans"));
        GT.add(new Player(55, "Anuj Rawat",            0,   0, "Gujarat Titans"));
        GT.add(new Player(1,  "Kumar Kushagra",        0,   0, "Gujarat Titans"));
        GT.add(new Player(46, "Rahul Tewatia",         0,   0, "Gujarat Titans"));
        GT.add( new Player(26, "Dasun Shanaka",         0,   0, "Gujarat Titans"));
        GT.add(new Player(20, "Arshad Khan",           23,   6, "Gujarat Titans"));
        GT.add(new Player(68, "Sherfane R.",           291,   0, "Gujarat Titans"));
        
        System.out.println("\t\t GUJRAT TITANS");
        for(Player p : GT)
		{
			System.out.print(p.getJn() + "\t"+p.getName() + "\t"+p.getRuns() + "\t"+p.getWickets() + "\t"+p.gettName() +"\n");
		}
        
        System.out.println("\n\nPlayers having more than 200 Runs.");
		for(Player p : GT)
		{
			if(p.getRuns()>200)
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers having less than 6 wickets.");
		for(Player p : GT)
		{
			if(p.getWickets()<6)
			System.out.println(p);
		}
	
		System.out.println("\n\nPlayers having \"r\" in their names.");
		for(Player p : GT)
		{
			if(p.getName().contains("r"))
			System.out.println(p);
		}
		
		System.out.println("\n\nPlayers name starts with P.");
		for(Player p : GT)
		{
			if(p.getName().startsWith("P"))
			System.out.println(p);
		}            System.out.println("\n");
 
	
  
	
	}}	
	
	
	
	
	
	
	
	
	