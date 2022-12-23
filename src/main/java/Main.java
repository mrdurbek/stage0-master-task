import com.epam.algorithms.ArrayTasks;
import com.epam.conditions.BitwiseValuesSwap;
import com.epam.conditions.SeasonDeterminer;
import com.epam.conditions.TriangleSidesValidator;
import com.epam.langSyntax.DigitsSumCalculator;
import com.epam.langSyntax.NumberReverter;
import com.epam.loops.MultiplicationTable;

public class Main {
	public static void main(String[] args) {
		
		NumberReverter reverter = new NumberReverter();
		reverter.revert(489);
		
		DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
		digitsSumCalculator.calculateSum(4789);
		
		SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
		seasonDeterminer.tellTheSeason(4);
		
		TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();
		triangleSidesValidator.validate(3, 4, 5);
		
		BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
		bitwiseValuesSwap.swap(0, 5);
		
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.printTable(5);
		
		ArrayTasks arrayTasks = new ArrayTasks();
		int[][] arr = arrayTasks.sortRaggedArray(new int[][] {{3 , 6 , 4},{9 , 8  , 7}});
	
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
