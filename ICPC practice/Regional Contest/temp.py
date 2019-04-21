n = int(input())
string = input()
q = int(input())

for incr in range(q):
	k = int(input())
	i = 0
	j = k
	count = 0
	if k>=n:
		i = k-n+1
		j = n-1
	while i < j:
		if string[i] == string[j]:
			count += 2
		i = i+1
		j = j-1
	if k%2 == 0 and k/2 < n:
		count = count + 1
	print(count)