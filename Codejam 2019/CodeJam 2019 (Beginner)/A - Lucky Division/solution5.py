m = int(input())
lim = [int(a) for a in input().split()]
lim.sort()
n = int(input())
lin = [int(b) for b in input().split()]
lin.sort(reverse = True)


#determine the max ratio
maxratio = 0
count = 1
for c in range(n):
	for d in range(m):
		ratio = lin[c]/lim[d]
		if(int(ratio) == ratio and ratio >maxratio):
			count = 1
			maxratio = ratio
		elif int(ratio) == ratio and ratio == maxratio:
			count = count + 1

print(count)