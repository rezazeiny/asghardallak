#include<stdio.h>
int asghar(int a){
	if(a>=0)
		return a;
	else
		return -a;
}
int isPrime(int num0)
{
    int i;
    if(num <= 1)
        return 0;
    else if(num == 2 || num == 3)
        return 1;
    for(i= 2; i* i<= num ; i++)
        if(num% i == 0)
            return 0;
    return 1;
}
int main() {
	printf("Hello world!");
	return 0;
}
