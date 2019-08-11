#include<stdio.h>
int main()
{
int a,exponent;
long long result =1;
printf("Enter a base number:");
scanf("%d",&a);
printf("Enter a exponent number:");
scanf("%d",&exponent);
while(exponent !=0)
{
result *=a;
--exponent;
}
printf("Answer=%11d",result);
return 0;
}
