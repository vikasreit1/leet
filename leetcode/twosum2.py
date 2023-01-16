#!/usr/bin/env python



def returnIndex(input_array, sum):
    output_list=[]
    for i in input_array:
        for j in input_array[1:]:
            if i+j==sum:
               return [input_array.index(i),input_array.index(j)]
            else:
               continue 
#    return output_list
print(returnIndex([5,3,6,1,2,8,4,7], 7))
print(returnIndex([5,3,6,1,2,8,4,7], 9))
print(returnIndex([5,3,6,1,2,8,4,7], 8))
print(returnIndex([5,3,6,1,2,8,4,7], 6))
