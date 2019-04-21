n = int(input())
s = input()
q = int(input())

def findOccurences(sr, ch):
	return [i for i, letter in enumerate(sr) if letter == ch]

for incr in range(q):
	k = int(input())

	count = 0
	# for j in range()
	
	for i in range(10):
		ch = chr( ord('a') + i)
		li = findOccurences(s, ch)
		for index1 in li:
			if 2*index1 == k:
				count += 1
			for index2 in li:
				if index1 != index2 and index1 + index2 == k:
					count += 1
	print("     >> " + str(count))


