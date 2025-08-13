#include<stdio.h>
#include<conio.h>
 
 int evenorodd ();
 int main (){
    int z;
    z=evenorodd();
    printf("the number is %d",z);
    return z;
 }
 int evenorodd()
 {
    int x;
    printf("enter the number");
    scanf("%d",&x);
    if(x%2==0)
    printf("number is even");
    else
    printf("number is odd");
 }
 