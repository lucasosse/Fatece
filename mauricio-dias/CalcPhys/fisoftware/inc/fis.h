#ifndef FIS_H
    #define FIS_H
        typedef struct vector_t
        {
            float x;
            float y;
        }  VECTOR;
        void init_vector(VECTOR *vect);
        void decomposing_force(float magnitude_vect, float angle, VECTOR *deco_vect);
#endif
