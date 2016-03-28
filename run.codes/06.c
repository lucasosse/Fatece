#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char *argv[]){

int i, pairCount=0;
float p, p1=0.0;
float q, q1=0.0;
float res = 0.0;

  scanf("%d", &pairCount);

  for(i=0;i<pairCount;i++){

    if(i%2==0){
      scanf("%f %f", &p, &q);
    }else{
      scanf("%f %f", &p1, &q1);
    }if(i>0){
      res = (pow(p-p1,2)+pow(q-q1,2));
    }

  }

  res = sqrt(res);
  printf("%.4f\n", res);

return 0;
}
