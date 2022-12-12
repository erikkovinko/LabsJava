package lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Variant4Test {

	@Test
	void intMethodTest1() {
		var something = new Variant4();
		int output = something.intMethod(3, 2);
		assertEquals(1,output);
	}
	
	@Test
	void intMethodTest2() {
		var something = new Variant4();
		int output = something.intMethod(94, 6);
		assertEquals(15,output);
	}
	
	@Test
	void ifMethodTest1() {
		var something = new Variant4();
		int output = something.ifMethod(-23,94, 6);
		assertEquals(2,output);
	}
	
	@Test
	void ifMethodTest2() {
		var something = new Variant4();
		int output = something.ifMethod(32,-94, 6);
		assertEquals(2,output);
	}
	
	@Test
	void ifMethodTest3() {
		var something = new Variant4();
		int output = something.ifMethod(32,34, -6);
		assertEquals(2,output);
	}
	
	@Test
	void whileMethodTest1() {
		var something = new Variant4();
		boolean output = something.whileMethod(81);
		assertEquals(true,output);
	}
	
	@Test
	void whileMethodTest2() {
		var something = new Variant4();
		boolean output = something.whileMethod(6);
		assertEquals(false,output);
	}
	
	@Test
	
	void whileMethodTest3() {
		var something = new Variant4();
		boolean output = something.whileMethod(-7);
		assertEquals(false,output);
	}
	
	@Test
	
	void boolMethodTest1() {
		var something = new Variant4();
		boolean output = something.bolMethod(1,23,4);
		assertEquals(false,output);
	}
	
	@Test
	
	void boolMethodTest2() {
		var something = new Variant4();
		boolean output = something.bolMethod(1,1,1);
		assertEquals(true,output);
	}
	
@Test
	
	void arrayMethodTest1() {
		var something = new Variant4();
		int output[];
		output = new int[4];
		output = something.arrayMethod(1,2,4);
		int result[] = {1,2,4,8};
		Assertions.assertArrayEquals(result,output);
	}

@Test

void arrayMethodTest2() {
	var something = new Variant4();
	int output[];
	output = new int[4];
	output = something.arrayMethod(1,3,4);
	int result[] = {1,3,9,27};
	Assertions.assertArrayEquals(result,output);
}
@Test

void forMethodTest1() {
	var something = new Variant4();
	double output[]= new double[10];
	output = something.forMethod(10);
	double result[] = {10,20,30,40,50,60,70,80,90,100};
	Assertions.assertArrayEquals(result,output);
}

@Test

void caseMethodTest1() {
	var something = new Variant4();
	int output;
	output = something.caseMethod(10);
	Assertions.assertEquals(31,output);
}

@Test

void caseMethodTest2() {
	var something = new Variant4();
	int output;
	output = something.caseMethod(11);
	Assertions.assertEquals(30,output);
}

@Test

void caseMethodTest3() {
	var something = new Variant4();
	int output;
	output = something.caseMethod(-11);
	Assertions.assertEquals(0,output);
}

@Test

void matrixMethodTest1() {
	var something = new Variant4();
	int[][] output= {{1,2,3},{4,5,6},{1,1,1},{7,8,9}};
	int[][] input= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] res;
	res = something.matrixMethod69(input,3,3,1);
	Assertions.assertArrayEquals(output,res);
}

@Test

void matrixMethodTest2() {
	var something = new Variant4();
	int[][] output= {{1,2,3},{1,1,1},{4,5,6},{7,8,9}};
	int[][] input= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] res;
	res = something.matrixMethod69(input,3,3,0);
	Assertions.assertArrayEquals(output,res);
}

}
