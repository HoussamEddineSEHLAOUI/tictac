package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenaitre extends JFrame {
	private int pivo = 2 ;
	public int  [][] mat =
			{
					{0,0,0},
					{0,0,0},
					{0,0,0}
			};
	public Fenaitre () {
		
		//design fenaitre :
		
		this.setTitle("TicToc");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		// Contenet Panel button
		
		JPanel panBu = new JPanel();
		panBu.setBackground(Color.ORANGE);
		panBu.setLayout(new GridLayout(3, 3));
		
		JButton A1 =new JButton("");
		JButton A2 =new JButton("");
		JButton A3 =new JButton("");
		
		JButton B1 =new JButton("");
		JButton B2 =new JButton("");
		JButton B3 =new JButton("");
		
		JButton C1 =new JButton("");
		JButton C2 =new JButton("");
		JButton C3 =new JButton("");
		
		panBu.add(A1);
		panBu.add(A2);
		panBu.add(A3);
		
		panBu.add(B1);
		panBu.add(B2);
		panBu.add(B3);
		
		panBu.add(C1);
		panBu.add(C2);
		panBu.add(C3);
		
		// Conetnet Panel rest button
		
		JPanel panRe = new JPanel();
		panRe.setBackground(Color.ORANGE);
		panRe.setLayout(new GridLayout(3, 1));
		JButton rest = new JButton ("REST");
		panRe.add(rest);
		
		
		
		// Conetent panel menu 
		
		JPanel menu = new JPanel();
		menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS) );
		menu.add(panBu);
		menu.add(panRe);
		 
		// add the menu panel to Fenaitre
		
        this.setContentPane(menu);
        
        //Action of button 
        A1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC A1");
            
               System.out.println(mat[0][0]);
               if(mat[0][0]==0) {
            	   if(tour()==1) {
            		   A1.setText("X");	   
            	   }else {
            		   A1.setText("O");	
            		   
            	   }
            	   
            	   
               }
              }
         });  
        
        A2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC A2");
               System.out.println(mat[0][1]);
               if(mat[0][1]==0) {
            	   if(tour()==1) {
            		   A2.setText("X");	   
            	   }else {
            		   A2.setText("O");	
            		   
            	   }
            	 
               }
              }
         });
        A3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC A3");
              
               System.out.println(mat[0][2]);
               int a = tour() ;
               if(mat[0][2]==0) {
            	   if(a==1) {
            		   A3.setText("X");
            		   
            	   }else {
            		   A3.setText("O");	
            		   
            	   }
            	   
            	  
               }
              }
         });
        
        
        
        
        
        
        
        B1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC B1");
               
               System.out.println(mat[1][0]);
               if(mat[1][0]==0) {
            	   if(tour()==1) {
            		   B1.setText("X");	   
            	   }else {
            		   B1.setText("O");	
            		   
            	   }
               }
              }
         });
        
        B2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC B2");
              
               System.out.println(mat[1][1]);
               if(mat[1][1]==0) {
            	   if(tour()==1) {
            		   B2.setText("X");	   
            	   }else {
            		   B2.setText("O");	
            		   
            	   }
               }
              }
         });
        B3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC B3");
               
               System.out.println(mat[1][2]);
               if(mat[1][2]==0) {
            	   if(tour()==1) {
            		   B3.setText("X");	   
            	   }else {
            		   B3.setText("O");	
            		   
            	   }
               }
              }
         });
        
        
        
        
        
        
        
        C1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC C1");
               
               System.out.println(mat[2][0]);
               if(mat[2][0]==0) {
            	   if(tour()==1) {
            		   C1.setText("X");	   
            	   }else {
            		   C1.setText("O");	
            		   
            	   }
               }
              }
         });
        
        C2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC C2");
               
               System.out.println(mat[2][1]);
               if(mat[2][1]==0) {
            	   if(tour()==1) {
            		   C2.setText("X");	   
            	   }else {
            		   C2.setText("O");	
            		   
            	   }
               }
              }
         });
        C3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC C3");
              
               System.out.println(mat[2][2]);
               if(mat[2][2]==0) {
            	   if(tour()==1) {
            		   C3.setText("X");	   
            	   }else {
            		   C3.setText("O");	
            		   
            	   }
               }
              }
         });
		
		
        
        rest.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){				
               System.out.println("CLIC REST");
               int k;
               for (int i=0 ;i<3 ;i++) {
            	   for (k =0 ;k<3;k++) {
            		   mat[i][k]=0;
            	   }
               }
               //vider les case
               A1.setText("");
               B1.setText("");
               C1.setText("");
               
               A2.setText("");
               B2.setText("");
               C2.setText("");
               
               A3.setText("");
               B3.setText("");
               C3.setText("");
              }
         });
		
		
		
	}
	public int tour() {
		System.out.println(pivo);
		if(this.pivo==1) {
			this.pivo=2 ;
			return 2;
		}
		this.pivo=1;
		return 1;
	}
	
	
	//how win
	public int howWin() {
		//verifier on ligne
		int i =0;
		for(i=0;i<3;i++) {
			if(mat[i][0]==mat[i][1] & mat[i][1]==mat[i][2]  ) return mat[i][0] ;
		}
		//verifier en colone
		for(i=0;i<3;i++) {
			if(mat[0][i]==mat[1][i] & mat[1][i]==mat[2][i]  ) return mat[0][i] ;
		}
		//verifier diag princeipal
		if(mat[0][0]==mat[1][1] & mat[1][1]==mat[2][2]  ) return mat[0][0] ;
		//verifier diag second
		if(mat[0][2]==mat[1][1] & mat[1][1]==mat[2][0]  ) return mat[2][0] ;
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    


}
