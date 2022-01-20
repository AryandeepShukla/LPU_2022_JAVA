import java.util.Scanner;

public class ChessQueen {

	public static void main(String[] args) {
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		char [][] chess = new char[8][8];
		
		//setting up chess board
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
					chess[i][j]=square;
					
				}else {
					char square = (j % 2) == 0 ? blackSquare : whiteSquare;
					chess[i][j]=square;
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		//placing queens
		int i=0, j=0, c=1;
		do{ 
			System.out.println("Enter coordinates for the "+c+" queen : ");
			i=sc.nextInt()-1;
			j=sc.nextInt()-1;
			boolean available = true;
			for(int x=0;x<8;x++) {
				if(chess[i][x]!=queen && chess[x][j]!=queen){
					continue;
				}
				else {
					available = false;
					break;
				}
			}
			
			chess[i][j] = (available) ? queen : chess[i][j];
			if(!available)
				System.out.println("Entered row or column already contains a queen plz reEnter! ");
			c = (available) ? ++c : c;
			
		}while(c<=4);
	
		//displaying board
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				System.out.print(chess[x][y]+" ");
			}
			System.out.println();
		}

	}
}
