#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char *argv[]){

float real1, real2, real3 =0;
float root1, root2 = 0;
float delta, irrNum=0;

	scanf("%f%f%f", &real1, &real2, &real3);

	delta = (pow(real2, 2)-4*real1*real3);

	//root1 = (-real2+sqrt(delta))/(2*real1);
	//root2 = (-real2-sqrt(delta))/(2*real1);


	if(delta==0){
		root1=root2=-real2/(2*real1);
		printf("DUPLA\n");
		printf("RD %f\n", root1);
	}if(delta>0){
		root1 = (-real2+sqrt(delta))/(2*real1);
		root2 = (-real2-sqrt(delta))/(2*real1);
		printf("REAIS\n");
		printf("R1 %f\n", root1);
		printf("R2 %f\n", root2);
	}if(delta<0){
		root1 = (-real2)/(2*real1);
		//delta = delta * -1;
		delta = sqrt(-delta)/(2*root1);
		printf("COMPLEXAS\n");
		printf("R %f\n", root1);
		printf("I %f\n", delta);
	}

return 0;
}
