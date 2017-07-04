#include<stdio.h>
#include<conio.h>
void main()
{ 
   int n;
   printf("\n enter a number between 1 to 9");
  scanf("%d",&n);
   if(n<1||n>9)
   {
      printf("enter a valid input");
   }
   
   getch();
}
