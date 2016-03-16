#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(int argc, char *argv[]){

float real1, real2, real3 =0;
float root1, root2 = 0;
float delta=0;

	scanf("%f%f%f", &real1, &real2, &real3);

	delta = sqrt(pow(real2, 2)-4*real1*real3);

	root1 = (-real2+delta)/(2*real1);
	root2 = (-real2-delta)/(2*real1);


	if(root1==root2){
		printf("DUPLA\n");
		printf("RD %f\n", root1);
	}if(delta<0){
		printf("R1 %f\n", root1);
		printf("I %f\n", delta);
	}else{
		printf("REAIS\n");
		printf("R1 %f\n", root1);
		printf("R2 %f\n", root2);
	}

return 0;
}
