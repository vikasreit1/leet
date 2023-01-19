#!/usr/bin/env python

def TwoSum(inputlist, sum):
    outList=[]
    for i in inputlist:
        for j in inputlist[1:]:
            if i+j==sum and i!=j:
                outList.append([inputlist.index(i),inputlist.index(j)])
            else:
                continue
    return outList

print(TwoSum([5,2,6,1,3,0,4,7],7))
print(TwoSum([5,2,6,1,3,0,4,7],5))
print(TwoSum([5,2,6,1,3,0,4,7],4))
print(TwoSum([5,2,6,1,3,0,4,7],3))
