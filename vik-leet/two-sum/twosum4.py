#!/usr/bin/env python


def returnIndex(input_arr, sum):
  print(" ")
  print("Input: ",input_arr,sum)
  output_list=[]
  for i in input_arr:
      print(i)
      for j in input_arr[1:]:
          if i+j==sum and i!=j:
             output_list.append([input_arr.index(i),input_arr.index(j)])
      input_arr.pop(0)   
  return output_list


#             return([input_arr.index(i),input_arr.index(j)])



print(returnIndex([4,3,5,2,6,1,8,7],7))
print(returnIndex([4,3,5,2,6,1,8,7],5))
print(returnIndex([4,3,5,2,6,1,8,7],9))
print(returnIndex([4,3,5,2,6,1,8,7],6))
print(returnIndex([4,3,5,2,6,1,8,7],4))
