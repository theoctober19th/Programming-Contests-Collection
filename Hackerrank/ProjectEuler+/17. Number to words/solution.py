ones = ['', 'One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine', 'Ten', 'Eleven', 'Twelve', 'Thirteen', 'Fourteen', 'Fifteen', 'Sixteen', 'Seventeen', 'Eighteen', 'Nineteen']
tens = ['', '', 'Twenty', 'Thirty', 'Forty', 'Fifty', 'Sixty', 'Seventy', 'Eighty', 'Ninety']
places = ['', '', ' Thousand', ' Million', ' Billion', ' Trillion', ' Quadrillion', ' Quintillion', ' Sextillion', ' Septillion', ' Octillion', ' Nonillion', ' Decillion', ' Undecillion', ' Duodecillion', ' Tredecillion', ' Quattuordecillion', ' Quindecillion', ' Sexdecillion', ' Septendecillion', ' Octodecillion', ' Novemdecillion', ' Vigintillion']

def tail(n):
	if n < 20:
		return ones[n]
	else:
		t = n // 10
		o = n % 10
		return tens[t] + ('' if t==0 else ' ') + ones[o] 


def printHundred(num):
	h = num // 100
	to = num % 100
	return tail(h) + ('' if h==0 else ' Hundred') + ('' if to==0 or h==0 else ' ') + tail(to)

t = int(input())

for i in range(t):
	n = int(input())
	ans = ''

	if(n==0):
		ans = 'Zero'
	else:
		c = 1
		while n != 0:
			a = n % 1000
			n = n // 1000
			ans = printHundred(a) + (places[c] if a!=0 else '') + ('' if ans == '' or ans[0] == ' ' else ' ') + ans
			c = c + 1

	print(ans)