package dataSaA;

import java.util.Arrays;

public class SortAlgorithms {
	
	
	public static void main(String[] args) {
		SortAlgorithms sort = new SortAlgorithms();
		int[]array = {2,4,5,6,2,323,5,6,53,4,23,6,65,4,23,54};
		System.out.println(Arrays.toString(array));
		sort.bubbleSort(array,false);
		System.out.println(Arrays.toString(array));
		
	}
	
	
	//Will sort everything for smallest to largest or viceversa
	//true if is normal, false if is reverse
	public void bubbleSort(int[]array,boolean order) {
		int aux =0;
		for (int i = array.length -1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if(order) {
					if(array[j]>array[j+1]) {
						swapValues(array[j],array[j+1]);
						aux = array[j];
						array[j] =array[j+1];
						array[j+1] = aux;
					}
				}else {if(array[j]<array[j+1]) {
					swapValues(array[j],array[j+1]);
					aux = array[j];
					array[j] =array[j+1];
					array[j+1] = aux;
				}}
				
			}		
		}
		
	}






public void swapValues(int x, int y) {
	int aux =x;
	x = y;
	y = aux;
}

}