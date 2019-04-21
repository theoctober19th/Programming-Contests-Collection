strn = input()
length = len(strn)
n = int(strn)

wait = 0

if length == 1:
	wait = 1
else:
	firstdigit = int(strn[0])
	firstdigit = firstdigit + 1
	multiplier = (10**(length - 1))
	subfrom = firstdigit * multiplier
	wait = subfrom - n

print(wait)