from collections import Counter
import heapq

arr = [1,2,3,2,1,2,3,4,3,2,1,3,2,1,1,1,2,4,5,2,3,4,2,2,5,7,89,7,6,6,5,4,3,2,3,45,6,4,3,5,6,7,1,1,3]
counter = Counter(arr)
top = counter.most_common(3)
print(top)
print(heapq.nlargest(3,arr))
print(heapq.nsmallest(3, arr))