#include<stdio.h>
int main()
{
char *c="Hello";
int n,i;
scanf("%d",&n);
for(i=n;i>0;i--)
{
   if(i>1)
    printf("%s\n",c);
   else
    printf("%s",c);
}
return 0;
}
