#!/usr/bin/env python

def TwoSum(inputlist, sum):
    outList=[]
    list1=inputlist[:-1]
    list2=inputlist[1:]
    for i in list1:
        for j in list2:
            if i+j==sum and i!=j:
                outList.append([inputlist.index(i),inputlist.index(j)])
            else:
                continue
        list2.pop(0)
    return outList

print(TwoSum([5,2,6,1,3,0,4,7],7))
print(TwoSum([5,2,6,1,3,0,4,7],5))
print(TwoSum([5,2,6,1,3,0,4,7],4))
print(TwoSum([5,2,6,1,3,0,4,7],3))
