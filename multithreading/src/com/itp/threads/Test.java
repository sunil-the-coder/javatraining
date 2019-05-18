package com.itp.threads;

public class Test {

	public static void main(String[] args) {
		for (int i = 2; i < 4; i++)
			for (int j = 2; j < 4; j++)
				if(i < j)
					assert i != j : i;
	}
}
