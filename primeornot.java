#include <stdio.h> 

int main() 
{ 
	int n, k, flag = 1; 
	printf("Enter a number: \n"); 
	scanf("%d", &n); 
     for (k = 2; k <= sqrt(n) / 2; k++) { 
		if (n % k == 0) { 
			flag = 0; 
			break; 
		} 
	} 

	if (flag == 1) { 
		printf("%d is a prime number", n); 
	} 
	else { 
		printf("%d is not a prime number", n); 
	} 

	return 0; 
} 
