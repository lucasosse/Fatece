#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[]){

int year =0;
  scanf("%d", &year);

  if(year%4 == 0){
    printf("SIM\n");
  }else{
    printf("NAO\n");
  }

return 0;
}
