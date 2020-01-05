import sys
cache_limit = 5000001
collatz_length = [0]*cache_limit
collatz_length[1] = 1 
max_lengths = [1] * cache_limit

def get_collatz_length(n):
    #if collatz_length[n] != 0:
    if n < cache_limit and collatz_length[n] != 0:
        return collatz_length[n]
    else:
        count = 0
        if n % 2 == 0:
            count = 1 + get_collatz_length(n >> 1)
        else:
            count = 1 + get_collatz_length(3*n + 1)
        if n < cache_limit:
            collatz_length[n] = count
        return count

key, value = 1, 1
for i in range(1, 5000001):
    foo = get_collatz_length(i)
    if foo >= value:
        max_lengths[i] = i
        value = foo
        key = i
    else:
        max_lengths[i] = key


t = int(input())
nums = [int(input()) for _ in range(t)]
for n in nums:
    print(max_lengths[n])
