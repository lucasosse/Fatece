#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[]){

float speed, velocity, course_time =0;
float dist=0;

  printf("Type Speed: \n");
  scanf("%f", &speed);
  printf("Type velocity: \n");
  scanf("%f", &velocity);
  printf("Type Time: \n");
  scanf("%f", &course_time);

  dist = (speed*course_time)+(0.5*velocity*course_time*course_time);
  //dist = dist/2;
  printf("The distance was: %f\n",dist);

return 0;
}
