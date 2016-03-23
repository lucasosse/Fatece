#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char *argv[]){

int i, pairCount=0;
float p[50], q[50], res;

  scanf("%d", &pairCount);

  for(i=0;i<pairCount;++i){
    scanf("%f %f", &p[i], &q[i]);
    if(i=0){
      res = sqrt(pow(p[i]-q[i], 2));
    }else{
      res = res+sqrt(pow(p[i]-q[i], 2));
    }
    i++;
  }

  printf("%.4f\n", res);

return 0;
}
