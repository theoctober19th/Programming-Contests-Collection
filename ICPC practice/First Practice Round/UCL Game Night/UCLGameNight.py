T = int(input())
for incr in range(T):
	N, M, K = list(map(int, input().split()))
	print(N, M, K)
	rowcounts
	P = []
	rows = []
	cols = []

	for i in range(N):
		li = list(map(int, input().split()))
		P.append(li)
		for j in range(len(li)):
			if li[j]==1:
				rows.append(i)
				cols.append(j)

	rows.sort()
	cols.sort()
	print(rows)
	print(cols)