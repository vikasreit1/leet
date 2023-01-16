#!/usr/bin/env python

def returnIndex(input_arr,sum):
    output_list=[]
    list1=input_arr
    list2=input_arr[1:]
    print(" ")
    print(" Input: ",input_arr,sum)
    for i in list1[:-1]:
            for j in list2:
                if i+j==sum and i!=j:
                   output_list.append((input_arr.index(i),input_arr.index(j)))
            list2.pop(0)
    return output_list




#print(twoSum([4,3,5,2,6,1,8,7],7))
print(returnIndex([4,3,5,2,6,1,8,7],7))
print(returnIndex([4,3,5,2,6,1,8,7],5))
print(returnIndex([4,3,5,2,6,1,8,7],9))
print(returnIndex([4,3,5,2,6,1,8,7],6))
print(returnIndex([4,3,5,2,6,1,8,7],4))
