#ifndef FIS_H
    #define FIS_H
        typedef struct vector_t
        {
            float x;
            float y;
        }  VECTOR;
        void init_vector(VECTOR *vect);
        void decomposing_force(float magnitude_vect, float angle, VECTOR *deco_vect);
        void calcDis(float s,float v,float ct,float d);
        void kmp2mps(float kph, float mps); 
#endif
