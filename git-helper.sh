#!bin/bash

  echo -n "Enter your commit message and press [ENTER]: "
  read commit

  git add *
  git commit -m "$commit"
  git push origin master
