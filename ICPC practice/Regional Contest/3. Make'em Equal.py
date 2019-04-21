#The Coffee Coders
#9 Oct 2018
n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
count = 0
for i in range(n):
    if B[i] > A[i]:
        count = -1.5
        break
    count = count + (A[i] - B[i])/2
print(int(count + 0.5))