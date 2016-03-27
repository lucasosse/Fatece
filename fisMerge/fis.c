#include "inc/fis.h"
#include <stdlib.h>
#include <stdio.h>
#include <math.h>

void init_vector(VECTOR *vect)
{
    vect->x = 0.0;
    vect->y = 0.0;
}

void decomposing_force(float magnitude_vect, double angle, VECTOR *deco_vect)
{
    deco_vect->x = sin(angle) * magnitude_vect;
    deco_vect->y = cos(angle) * magnitude_vect;
}

void calcDis(float s,float v,float ct,float d){

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

}

void kmp2mps(float kph, float mps){

    float kph, mps=0;

    printf("Type KPH: ");
    scanf("%f", &kph);

    mps = kph * 3.6;

    printf("%.3f meters per second\n", mps);

}
