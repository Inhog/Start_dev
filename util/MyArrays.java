package util;

public class MyArrays {
	/**
	 * 
	 * @param src 
	 * @return 
	 */
	public static int[] sort(int[] src){
		int[] data = new int[src.length];
		System.arraycopy(src, 0, data, 0, src.length);
		
		for(int i= 0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i] < data[j]){
					int temp = data[i];
					data[i]= data[j];
					data[j] = temp;
				}
			}
		}
		return data;
	}
	
	public static void print(int[] data){
		System.out.print("[");
		for(int i=0; i<data.length;i++){
			if(i==data.length-1){
				System.out.print(data[i]);
			}
			else{
			System.out.print(data[i]+",");
			}
		}
		System.out.print("]");
	}
}
