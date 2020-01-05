def is_sunday(y, m, d):
    t = [0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4]
    y -= 1 if m < 3 else 0
    return 1 if (y + y//4 - y //100 + y //400 + t[m-1] + d) % 7 == 0 else 0

t = int(input())
for _ in range(t):
    (y1, m1, d1) = map(int, input().split())
    (y2, m2, d2) = map(int, input().split())
    count = 0
    
    if y1 == y2:
        for month in range(m1, m2+1):
            count += is_sunday(y1, month, 1)
    
    else:
        for month in range(m1, 13):
            count += is_sunday(y1, month, 1)
        for year in range(y1+1, y2):
            for month in range(1, 13):
                count += is_sunday(year, month, 1)
        for month in range(1, m2 + 1):
            count += is_sunday(y2, month, 1)
    
    if is_sunday(y1, m1, 1) and d1 > 1:
            count -= 1  

    print(count)