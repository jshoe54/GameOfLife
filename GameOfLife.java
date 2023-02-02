public class GameOfLife{
	int size;
	int [][] board = new int[][];
	int [][] previous = new int [][];
	
	public GameOfLife(){
	
	}
	
	public GameOfLife(int size){
		this.size=size;
		this.board=new int[size][size];
		this.previous=new int[size][size];
	}
	
	public GameOfLife(int[][] board){
		this.size=board.length;
		this.previous=new int[this.size][this.size];
		for(int i=0; i<this.board.length; i++){
			for(int j=0; j<this.board[i].length;j++){
			this.previous[i][j]=this.board[i][j];
			}
		}
		this.board=size;
		for(int i=0; i<this.board.length; i++){
			for(int j=0; j<this.board[i].length;j++){
			this.board[i][j]=board[i][j];
			}
		}
	}
	public void onestep(){
	}
	public int neighbors(int row, int col){
		int neighbors=0;
		if(board[row-1][col-1]==true){
		neighbors++;
		}
		if(board[row-1][col]==true){
		neighbors++;
		}
		if(board[row][col-1]==true){
		neighbors++;
		}
		if(board[row+1][col+1]==true){
		neighbors++;
		}
		if(board[row+1][col]==true){
		neighbors++;
		}
		if(board[row][col+1]==true){
		neighbors++;
		}
		if(board[row-1][col+1]==true){
		neighbors++;
		}
		if(board[row+1][col-1]==true){
		neighbors++;
		}
		return neighbors;
	}
	
	public void evolution(int n){
	for(int=0; i<n; i++){
		onestep();}
	}	