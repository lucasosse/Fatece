#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[]){

  float kph, mps=0;

  printf("Type KPH: ");
  scanf("%f", &kph);

  mps = kph * 3.6;

  printf("%.3f meters per second\n", mps);

return 0;
}
