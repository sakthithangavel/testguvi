#include<stdio.h>
#include<ctype.h>
int main()
{
char ch;
scanf("%d",&ch);
if(isalnum(ch))
  printf("No");
else
  printf("Alphabet");
return 0;
}
