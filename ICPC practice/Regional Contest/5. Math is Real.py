#The Coffee Coders
#7-oct-2018
T = int(input())

place = ("bit", "byte", "kb", "mb", "gb", "pb")

for i in range(T):
    raw = input().split()
    N = int(raw[0])
    frm = raw[1].lower()
    to = raw[2].lower()
    multiplier = 1

    findex = place.index(frm)
    tindex = place.index(to)
    result = N
    if not (findex == tindex):
        if findex == 0:
            multiplier = multiplier / 8
            findex += 1
        if tindex == 0:
            multiplier = multiplier * 8
            tindex += 1
        if(findex > tindex):
            multiplier = multiplier * 1024 ** (findex - tindex)
        else:
            multiplier = multiplier * (1/1024) ** (tindex - findex)
        result = multiplier * N
    print("Case " + str(i+1) + ": " + "{0:.15f}".format(result))