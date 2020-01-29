import java.lang.Math;
import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n_node = 5;
		int[][] edge = {{0,1,2,3,4},
						{1,0,100,2,3},
						{3,5,0,2,1},
						{10,2,5,0,1},
						{1,9,2,6,0}};
		for(int k = 0; k < n_node; k++){
			for(int i = 0; i < n_node; i++){
				for(int j = 0; j < n_node; j++){
					edge[i][j] = Math.min(edge[i][j], edge[i][k] + edge[k][j]);
				}
			}
		}
		
		for(int i = 0; i < n_node; i++) {
			for(int j = 0; j < n_node; j ++) {
				System.out.print(edge[i][j]);
			}
			System.out.println();
		}
	}

}
