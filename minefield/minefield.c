#include<stdio.h>
#include<stdlib.h>

void printMenu(){
  system("clear");
  printf("\t\t====WELCOME TO MINEFIELD===\n");
  printf("\t1.Start Game\n");
  printf("\t2.??\n");
  printf("\t3.Exit");
  printf("Type Option: ");

}

int menu(){
  char choice;
  int numReturn=0;

  do{
    printMenu();
    scanf("%c", &choice);

    switch(choice){
      case'1':
        numReturn 1;
      case'2':
        numReturn 2;

    }
  }while(numReturn!=0||numReturn!=1);

  return numReturn;
}

int main(int argc, char *argv[]){
  menu();
}
