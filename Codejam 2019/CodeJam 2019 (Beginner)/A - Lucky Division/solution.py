luckynums = []

def isLucky(num):
	for ch in num:
		if ch != '7' and ch != '4':
			return False
	return True

def findluckynums(num):
	for i in range(4,num):
		if isLucky(str(i)):
			luckynums.append(i)

if __name__ == "__main__":
	islucky = False
	n = input()
	intn = int(n)
	if isLucky(n):
		islucky = True
	else:
		findluckynums(intn)
		for ln in luckynums:
			if intn %ln == 0:
				islucky = True

	if islucky:
		print('YES')
	else:
		print('NO')
