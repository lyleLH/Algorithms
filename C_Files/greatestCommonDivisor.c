#include <stdio.h>

int gcd(int p, int q ){
	if(q ==0) return p;
	int r = p%q;
	return gcd(q,r);
}

int main(void) {

	printf("hello world! \n");
	printf("the  gcd is : %d\n",gcd(5,6));

	return 0;
}