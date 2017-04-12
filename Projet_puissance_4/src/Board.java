	import java.applet.Applet;
	import java.awt.Color;
	import java.awt.TextField;
	import java.util.Scanner;
	import javax.swing.JPanel;
	
public class Board extends main{
	    byte[][] grille = new byte[6][7];
	    
	    public Board(){
	        grille = new byte[][]{
	            {0,0,0,0,0,0,0,},
	            {0,0,0,0,0,0,0,},
	            {0,0,0,0,0,0,0,},
	            {0,0,0,0,0,0,0,},
	            {0,0,0,0,0,0,0,},
	            {0,0,0,0,0,0,0,},    
	        };
	    } 
	    
	    public boolean isLegalMove(int column){
	        return grille[0][column]==0;
	    }
	    
	    //Placer pieces
	    public boolean placeMove(int column, int player){ 
	        if(!isLegalMove(column)) {System.out.println("Illegal move!"); return false;}
	        for(int i=5;i>=0;--i){
	            if(grille[i][column] == 0) {
	                grille[i][column] = (byte)player;
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public void undoMove(int column){
	        for(int i=0;i<=5;++i){
	            if(grille[i][column] != 0) {
	                grille[i][column] = 0;
	                break;
	            }
	        }        
	    }
	    //Afficher le tableau
	    public void displayBoard(){
	        System.out.println();
	        for(int i=0;i<=5;++i){
	            for(int j=0;j<=6;++j){
	                System.out.print(grille[i][j]+" ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

		public static void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

	}