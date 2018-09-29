#include<stdio.h>
#include<ctype.h>
int main()
{
  char ch;
  scanf("%c",&ch);
  if(isalnum(ch))
  {
     printf("invalid");
  }
  else
  {
    ch=ch+32
     switch(ch)
     {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':printf("Vowel");
                 break;
        default :printf("Consonant");
                
     }
     return 0;
  }
}
