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
