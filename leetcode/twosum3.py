#!/usr/bin/env python


def returnIndex(input_arr, sum):
  print(input_arr,sum)
  for i in input_arr:
      for j in input_arr[1:]:
          if i+j==sum:
             return([input_arr.index(i),input_arr.index(j)])






print(returnIndex([4,3,5,2,6,1,8,7],7))
print(returnIndex([4,3,5,2,6,1,8,7],5))
print(returnIndex([4,3,5,2,6,1,8,7],9))
print(returnIndex([4,3,5,2,6,1,8,7],6))
print(returnIndex([4,3,5,2,6,1,8,7],4))
