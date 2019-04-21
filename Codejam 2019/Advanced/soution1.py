from collections import Counter

k = int(input())
s = input()

countdict = Counter(s)
chars = [i for i in countdict]
lens = [countdict[i] for i in countdict]

possible = True
base = ''

for i in range(len(lens)):
	if lens[i] % k != 0:
		possible = False
		break
	base = base + chars[i]*(lens[i]//k)

if not possible:
	print(-1)
else:
	print(base*k)

# ccopy = count.copy()

# li = [count[i] for i in count]

# for i in count:
# 	possible = True
# 	if(count[i] % k != 0):
# 		possible = False

# ans = ''

# if not possible:
# 	print(-1)
# else:
# 	while True:
# 		for i in count:
# 			ans = ans + i*(count[i]//k)
# 			ccopy[i] = ccopy[i] // k
# 		if ccopy[s[0]] == 0:
# 			break

# print(ans)