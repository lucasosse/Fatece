#include<stdio.h>
#include<stdlib.h>

void printMenu(){
  system("clear");
  printf("\t\t====WELCOME TO MINEFIELD===\n");
  printf("\t1.Start Game\n");
  printf("\t2.??\n");
  printf("\t3.Exit\n");
  printf("Type Option: ");

}

int menu(){
  char choice;
  int numReturn,breakLoop=0;

  do{
    printMenu();
    scanf("%c", &choice);

    switch(choice){
      case'1':
        numReturn=1;
        breakLoop=1;
        break;
      case'0':
        numReturn=2;
        breakLoop=1;
        break;

    }
  }while(!breakLoop);

  return numReturn;
}

int main(int argc, char *argv[]){
  menu();
}
