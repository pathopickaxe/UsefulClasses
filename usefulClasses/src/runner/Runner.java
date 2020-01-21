package runner;

import java.awt.Point;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import lang.Series;
import lang.Matrix;

public class Runner {

	public static void main(String[] args) {
		
	
		
		Function<String,String> b = x -> {
			x+= "hi";
			return x;
		};
		
		String s = "";
		
		s = b.apply(s);
		System.out.println(s);
		
		
		
		Matrix<Integer> mat = new Matrix<Integer> (10,10);
		
		BiConsumer<Point,Integer> fill = (point,unUsed) -> {
			mat.setValue(point.x, point.y, point.x*point.y);
		};
		mat.forEachIndex(fill);
		
		mat.printArr();
		
		Function<Integer, Integer> test = a -> {
			return a * 2;
		};
		System.out.println(mat.getClass());
		Matrix<Integer> test2 = new Matrix<Integer> (mat.returnForEach(test));
		
		test2.printArr();
		
	}
	
	

}
