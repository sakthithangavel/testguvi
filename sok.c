#include<stdio.h>
int main()
{
int n,k,i;
int sum=0;
scanf("%d%d",&n,&k);
int a[n];
for(i=0;i<n;i++)
{
 scanf("%d",a[i]);
}
if(k<0)
 printf("%d",sum);
else
{
  for(int i=0;i<k;i++)
  {
   sum+=a[i];
  }
  printf("%d",sum);
}
return 0;
}
