#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char *argv[]){

int i, pairCount=0;
float p[50], q[50];
//float q[50], q2[50];
float res = 0;

  scanf("%d", &pairCount);

  for(i=0;i<pairCount;i++){

    if(i==0){
      scanf("%f %f", &p[i], &p[i+1]);
      scanf("%f %f", &q[i], &q[i+1]);
      //printf("passed scan\n");
      res = (p[i]-q[i])*(p[i]-q[i]);
      //printf("passed equation, result: %f",res);
      //i++;
      //printf("passed incrementer");
    }else{
      //printf("looped once");
      //scanf("%f %f", &p[i+2], &p[i+3]);
      //scanf("%f %f", &q[i+2], &q[i+3]);
      res = res+((p[i]-q[i])*(p[i]-q[i]));
      //i++;
    }

  }

  res = sqrt(res);
  printf("%.4f\n", res);

return 0;
}
