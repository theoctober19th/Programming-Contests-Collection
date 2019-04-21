t = int(input())
outOfOrderList = []

def updateOutOfOrderList(arr):
    n = len(arr)
    outOfOrderList.clear()
    for i in range(1,n-1): 
          # Unsorted pair found 
        if(arr[i-1] < arr[i]):
        	outOfOrderList.append(i)

def arraySortedOrNot(a,b):
	for i in range(len(outOfOrderList)):
		if a <= outOfOrderList[i] <= b:
			return False
    return True

for i in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    updateOutOfOrderList(arr)
    q = int(input())
    for j in range(q):
        p, a, b = list(map(int, input().split()))
        if p == 1:
            arr[a] = b
            if(a in outOfOrderList):
            	if a == 0 and b <= arr[a+1]:
            		outOfOrderList.remove(a)
            	elif a == n-1 and b >= arr[a-1]:
            		outOfOrderList.remove(a)
            	elif arr[a-1] <= b and b <= arr[a+1]:
            		outOfOrderList.remove(a)
            else:
            	if a == 0 and b > arr[a+1]:
            		outOfOrderList.append(a)
            	elif a == n-1 and b < arr[a-1]:
            		outOfOrderList.append(a)
            	elif arr[a-1] > b or b > arr[a+1]:
            		outOfOrderList.append(a)
        else:
            if(arraySortedOrNot(a,b)):
                print("yes")
            else:
                print("no")

