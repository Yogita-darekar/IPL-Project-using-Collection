package com.tka.july30;

public class Test {

	public static void main(String[] args) {
		
		Player[] RCB = new Player[11];
		
		RCB[0] = new Player(18,"Virat Kohli", 6000, 0, "RCB");
		RCB[1] = new Player(97,"Rajat Patidar", 3000, 5, "RCB");
		RCB[2] = new Player(25,"Krunal Pandya", 3000, 10, "RCB");
		RCB[3] = new Player(61,"Phil Salt", 5000, 10, "RCB");
		RCB[4] = new Player(06,"Jitesh Sharma", 3000, 7 , "RCB");
		RCB[5] = new Player(99,"Swastik C.", 4000, 10, "RCB");
		RCB[6] = new Player(43,"Tim Seifert", 2000, 20, "RCB");
		RCB[7] = new Player(16,"Mayank Agrawal", 900, 9, "RCB");
		RCB[8] = new Player(27,"Liam L.    ", 2000, 6, "RCB");
		RCB[9] = new Player(16,"Tim David", 1000, 5, "RCB");
		RCB[10] = new Player(28,"Manoj Bhandage", 700, 8, "RCB");
		
		System.out.println("\t ROYAL CHALLENGERS BENGLURU");
		
		for(int i = 0; i<11 ; i++)
		{
			System.out.print(RCB[i].getJn() + "\t");
			System.out.print(RCB[i].getName() + "\t");
			System.out.print(RCB[i].getRuns() + "\t");
			System.out.print(RCB[i].getWickets() + "\t");
			System.out.println(RCB[i].gettName());
		}
		
		System.out.println("\n");
		
		
		
		Player[] PBKS= new Player[11];
		
		PBKS[0] = new Player(96, "Shreyas Iyer", 604, 0, "Punjab Kings");
        PBKS[1] = new Player(10, "Prabhsimran S.", 599, 0, "Punjab Kings");
        PBKS[2] = new Player(18, "Shashank Singh", 350, 1, "Punjab Kings");
        PBKS[3] = new Player(33, "Marcus Stoinis", 160, 4, "Punjab Kings");
        PBKS[4] = new Player(7, "Josh Inglis", 278, 0, "Punjab Kings");
        PBKS[5] = new Player(21, "Nehal Wadhera", 369, 0, "Punjab Kings");
        PBKS[6] = new Player(24, "Priyansh Arya", 545, 1, "Punjab Kings");
        PBKS[7] = new Player(17, "Arshdeep Singh", 10, 8, "Punjab Kings");
        PBKS[8] = new Player(3, "Yuzvendra C.", 5, 6, "Punjab Kings");
        PBKS[9] = new Player(19, "Marco Jansen", 75, 6, "Punjab Kings");
        PBKS[10] = new Player(13, "Azmatullah O", 57, 7, "Punjab Kings");
        
        System.out.println("\t\t PUNJAB KINGS");
        
        for(int i = 0; i<11 ; i++)
		{
			System.out.print(PBKS[i].getJn() + "\t");
			System.out.print(PBKS[i].getName() + "\t");
			System.out.print(PBKS[i].getRuns() + "\t");
			System.out.print(PBKS[i].getWickets() + "\t");
			System.out.println(PBKS[i].gettName());
		}
        System.out.println("\n");
        
        
        Player[] GT = new Player[11];
        
        GT[0] = new Player(7,  "Shubman Gill",         650,  0, "Gujarat Titans");
        GT[1] = new Player(23, "Sai Sudharsan",        759,  3, "Gujarat Titans");
        GT[2] = new Player(35, "Shahrukh Khan",        179,  1, "Gujarat Titans");
        GT[3] = new Player(19, "Rashid Khan",           40,  9, "Gujarat Titans");
        GT[4] = new Player(63, "Jos Buttler",          538,  0, "Gujarat Titans");
        GT[5] = new Player(55, "Anuj Rawat",            0,   0, "Gujarat Titans");
        GT[6] = new Player(1,  "Kumar Kushagra",        0,   0, "Gujarat Titans");
        GT[7] = new Player(46, "Rahul Tewatia",         0,   0, "Gujarat Titans");
        GT[8] = new Player(26, "Dasun Shanaka",         0,   0, "Gujarat Titans");
        GT[9] = new Player(20, "Arshad Khan",           23,   6, "Gujarat Titans");
        GT[10]= new Player(68, "Sherfane R.",           291,   0, "Gujarat Titans");
        
        
        System.out.println("\t\t GUJRAT TITANS");
        
        for(int i = 0; i<11 ; i++)
		{
			System.out.print(GT[i].getJn() + "\t");
			System.out.print(GT[i].getName() + "\t");
			System.out.print(GT[i].getRuns() + "\t");
			System.out.print(GT[i].getWickets() + "\t");
			System.out.println(GT[i].gettName());
		}
        System.out.println("\n");
        
        
		Player[] MI = new Player[11];
		
		MI[0] = new Player(63, "Suryakumar Y.",   717,  0, "Mumbai Indians");
		MI[1] = new Player(18, "Trent Boult",         0, 22, "Mumbai Indians");
		MI[2] = new Player(93, "Jasprit Bumrah",      0, 18, "Mumbai Indians");
		MI[3] = new Player(45, "Rohit Sharma",       418,  0, "Mumbai Indians");
		MI[4] = new Player(44, "Ryan Rickelton",     388,  0, "Mumbai Indians");
		MI[5] = new Player(9,  "Tilak Varma",        343,  0, "Mumbai Indians");
		MI[6] = new Player(19, "Naman Dhir",         252,  0, "Mumbai Indians");
		MI[7] = new Player(33, "Hardik Pandya",      224, 14, "Mumbai Indians");
		MI[8] = new Player(22, "Will Jacks",         233,  6, "Mumbai Indians");
		MI[9] = new Player(74, "Mitchell S.",     40, 10, "Mumbai Indians");
		MI[10]= new Player(56, "Deepak Chahar",        37, 11, "Mumbai Indians");
		
		System.out.println("\t\t MUMBAI INDIANS");
		
		for(int i = 0; i<11 ; i++)
		{
			System.out.print(MI[i].getJn() + "\t");
			System.out.print(MI[i].getName() + "\t");
			System.out.print(MI[i].getRuns() + "\t");
			System.out.print(MI[i].getWickets() + "\t");
			System.out.println(MI[i].gettName());
		}
	}

}			

