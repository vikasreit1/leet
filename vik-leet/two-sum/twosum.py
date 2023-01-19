#!/usr/bin/env python3


def returnindexes(a,b):
    count = len(a)
    target = b
    endcount = 0
    while endcount < count:
     for i in a:
        while endcount < count:
            print("this is the sum")
            c=i+a[endcount]
            print(i+a[endcount])
            if i+a[endcount]==b:
               return b
            else:
               endcount+=1
               print ("notfound")
               continue


returnindexes([3,4,5,8,6,9],9)


