package nb;
/*
 * 不规则的二维数组
 */
public class ArrayIrregular {
	public static void main(String[] args) {
		final int max = 10;
		int[][] arr= new int[max+1][];
		for(int i =0;i<=max;i++){
			arr[i] = new int [i+1];
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				int n=1;
				for(int k=1;k<=j;k++){
					n = n*(i-k+1)/i;
				}
				arr[i][j] = n;
			}
		}
		for(int[] row:arr){
			for(int list:row){
				System.out.printf("%4d",list);
			}
			System.out.println();
		}
	}
}
