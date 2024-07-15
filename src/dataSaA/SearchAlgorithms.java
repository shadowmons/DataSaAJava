package dataSaA;

public class SearchAlgorithms {
	
	//Return the index of the value,return -1 if it does not find anything
	//Go throuh the array in a linear way
	public int linearSearch(int value, int[]array) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value) {
				index = i;
				return index;
			}
		}
		return index;
	}
	
	//Finding a value from a sorted array
	//Work spliting the array each time
	public void binarySearch () {
		
	}

}
