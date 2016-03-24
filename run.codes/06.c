#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char *argv[]){

int i, pairCount=0;
float p[50], q[50];
float res = 0;

  scanf("%d", &pairCount);

  for(i=0;i<pairCount;i++){

    if(i==0){
      scanf("%f %f", &p[i], &q[i]);
      //printf("passed scan\n");
      res = sqrt(pow(p[i]-q[i], 2));
      //printf("passed equation, result: %f",res);
      //i++;
      //printf("passed incrementer");
    }else{
      //printf("looped once");
      scanf("%f %f", &p[i], &q[i]);
      res = res+sqrt(pow(p[i]-q[i], 2));
      //i++;
    }

  }

  printf("%.4f\n", res);

return 0;
}
