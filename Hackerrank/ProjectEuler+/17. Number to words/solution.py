tail = ['', 'One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine', 'Ten', 'Eleven', 'Twelve', 'Thirteen', 'Fourteen', 'Fifteen', 'Sixteen', 'Seventeen', 'Eighteen', 'Nineteen', 'Twenty', 'Twenty One', 'Twenty Two', 'Twenty Three', 'Twenty Four', 'Twenty Five', 'Twenty Six', 'Twenty Seven', 'Twenty Eight', 'Twenty Nine', 'Thirty', 'Thirty One', 'Thirty Two', 'Thirty Three', 'Thirty Four', 'Thirty Five', 'Thirty Six', 'Thirty Seven', 'Thirty Eight', 'Thirty Nine', 'Forty', 'Forty One', 'Forty Two', 'Forty Three', 'Forty Four', 'Forty Five', 'Forty Six', 'Forty Seven', 'Forty Eight', 'Forty Nine', 'Fifty', 'Fifty One', 'Fifty Two', 'Fifty Three', 'Fifty Four', 'Fifty Five', 'Fifty Six', 'Fifty Seven', 'Fifty Eight', 'Fifty Nine', 'Sixty', 'Sixty One', 'Sixty Two', 'Sixty Three', 'Sixty Four', 'Sixty Five', 'Sixty Six', 'Sixty Seven', 'Sixty Eight', 'Sixty Nine', 'Seventy', 'Seventy One', 'Seventy Two', 'Seventy Three', 'Seventy Four', 'Seventy Five', 'Seventy Six', 'Seventy Seven', 'Seventy Eight', 'Seventy Nine', 'Eighty', 'Eighty One', 'Eighty Two', 'Eighty Three', 'Eighty Four', 'Eighty Five', 'Eighty Six', 'Eighty Seven', 'Eighty Eight', 'Eighty Nine', 'Ninety', 'Ninety One', 'Ninety Two', 'Ninety Three', 'Ninety Four', 'Ninety Five', 'Ninety Six', 'Ninety Seven', 'Ninety Eight', 'Ninety Nine']
places = ['', '', ' Thousand', ' Million', ' Billion', ' Trillion']


def printHundred(num):
	h = num // 100
	to = num % 100
	return tail[h] + ('' if h==0 else ' Hundred') + ('' if to==0 or h==0 else ' ') + tail[to]

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