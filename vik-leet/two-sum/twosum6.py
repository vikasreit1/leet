

def findIndex(list, target):
    for i in list:
        for j in list[list.index(i)+1:]:
            if i+j == target:
                return(list.index(i), list.index(j))
            
a=findIndex([2,7,9,4,13], 13)    
print(a)


