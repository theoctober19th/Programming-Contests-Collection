def countPairs(n, sum, string):
	# Create an empty hash set
	s = set()
	count = 0
	for i in range(n):
		if 2*i == sum:
			count = count + 1
		j = sum-i
		if (j>=0 and j in s):
			if string[i] == string[j]:
				count = count+2
		s.add(i)
	return count

s = "agabhaieafgeeeaidacd"
k = 40
n = 20
print(countPairs(n, k, s))