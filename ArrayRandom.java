package nb;

import java.util.Arrays;

//����һ���齱��Ϸ�е���ֵ���,��49��ֵ�г�ȡ6��
public class ArrayRandom {
	public static void main(String[] args) {
		int[] number = new int[49];
		int len = number.length;
		for(int i=0;i<len;i++){
			number[i] = i+1;
			
		}
		int[] result = new int[6];
		for(int i=0;i<result.length;i++){
			int r = (int) (Math.random()*49);
			result[i] = number[r];
			number[r] = number[i];
			len--;
		}
		Arrays.sort(result);
		for(int r1:result){
			System.out.println(r1+" ");
		}				
	}
}
