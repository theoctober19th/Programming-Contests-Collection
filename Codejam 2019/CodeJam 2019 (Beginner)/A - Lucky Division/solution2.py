[s, v1, v2, t1, t2] = [int(n) for n in input().split()]
first = t1*2 + s*v1
second = t2*2 + s*v2

if first > second:
	print('Second')
elif first == second:
	print('Friendship')
else:
	print('First')
