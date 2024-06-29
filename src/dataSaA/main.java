package dataSaA;


public class main {
    public static void main(String[] args) {
    	ArraysTest test1 = new ArraysTest();
    	ListTest test = new ListTest();
    	test.UnmutableListTest();
    	test.ArrayListTest();
    	
    	int[]array = {1,2,2,3,3,4,5,6,7,7,8,9};
    	test1.CalculusArray(array);
    	test1.OccurrencesArray(array, 2);
    	test1.SortingOddArray(array);
    	
    }
}