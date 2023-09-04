package patternsAlphabets;

public class Demo {
void patternA(char ch) {
	if(ch=='A')
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 4; j++) {
			if (i == 1 || j == 1 || j == 4 || i == 3)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}
}
void patternB(char ch) {
	if(ch=='B')
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 4; j++) {
			if (i == 1 || j == 1 || j == 4 || i == 3 || i == 5)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}

}
void patternC(char ch) {
	if(ch=='C')
	
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j == 1 || i == 5)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}

}
void patternD(char ch) {
	if(ch=='D')
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if ((i == 1&j<=4 )|| j == 1 || (i == 5&j<=4)||(i>=2&i<=4&j==5) )
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	
	}

}
void patternE(char ch) {
	if(ch=='E')
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j == 1 || i == 3 || i == 5)
				System.out.print("*");
			else
				System.out.println();
			
			

		}
		System.out.println();
	}
}
void patternF(char ch) {
	if(ch=='F')
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j == 1 || i == 3)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}

}
void patternG(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j == 1 || (i == 3 & j >= 3) || i == 5 || (j == 5 & i >= 3))
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}

}
void patternH(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 3 || j == 1 || j == 5 || (i == 1 & j <= 1 || j >= 5))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
void patternI(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 3 || i == 1 || i == 5)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
void patternJ(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 4 || (i == 1) || (i == 5 && j <= 3) || i == 4 && j <= 4 & j <= 1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
void patternK(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 1 && j >= 5 || i == 5 && j >= 5 || (i == 2 & j >= 3 & j != 4 & j != 5)
					|| (i == 4 & j >= 3 & j != 4 & j != 5) || i == 3 & j <= 2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}

}
void patternL(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 5)
				System.out.print("*");

		}
		System.out.println();
	}

}
void patternM(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || j == 5 || i == 3 && j <= 3 & j != 2 & j != 1 || i == 2 & j <= 2
					|| i == 2 & j != 3 & j <= 4)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
void patternN(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || j == 5 || i == 3 && j <= 3 & j != 2 & j != 1 || i == 2 & j <= 2 || i == 4 & j >= 4)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
void patternO(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if ((j == 1 & i != 5 & i != 1) || (i == 1 & j != 1 & j != 5 & j != 3) || (j == 5 & i != 5 & i != 1)
					|| (i == 5 & j != 5 & j != 1 & j != 3))
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}
}
void patternP(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 1 || j == 5 & i != 4 & i != 5 || i == 3)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}
}
void patternR(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || i == 1&j!=5 || i == 5 && j >= 5 ||j==5&&i!=4&i!=5&i!=1&i!=3|| 
					 (i == 4 & j >= 3 & j != 4 & j != 5) || i == 3&&j!=5 )
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}
}
void patternS(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || i == 3 || i == 5 || j == 1 & i != 4 & i != 5 || j == 5 & i != 2)
				System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();

	}
}
void patternT(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j == 3)
				System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	}
	void patternU(char ch) {
		  for(int i=1;i<=5;i++) {
			  for(int j=1;j<=5;j++) {
				  if(j==1||i==5||j==5)
				System.out.print("*");  
				
				else
					System.out.print(" ");
			  }
			  System.out.println();
		  }
		
}
void patternV(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if ((i == 1 & j <= 1 || j >= 5 & i != 4 & i != 5 && i != 3 && i != 4 && i != 2)
					|| (i == 2 & j != 3 & j != 1 & j != 5) || i == 3 && j != 5 && j != 4 && j != 2 && j != 1)
				System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();

	}
}
void patternW(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (j == 1 || j == 5 || (i == 3 & j != 2 & j != 4) ||( i == 4 & j != 3))
				System.out.print("*");
			else {
				System.out.print(" ");
			}
		}
		System.out.println();

	}
}
void patternX(char ch) {
	   for(int i=1;i<=5;i++) {
		   for(int j=1;j<=5;j++) {
			   if(i==j||i+j==6)
			   System.out.print("*");
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
	   }
}
void patternY(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == j & j <= 3 || i + j == 6 & i <= 3 || j == 3 & i >= 3)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
void patternZ(char ch) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= 5; j++) {
			if (i == 1 || j + i == 6 || i == 5)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}

}
