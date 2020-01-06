cache_limit = 100001
prime_number = [True] * cache_limit

def sieve(n):
    p = 2
    while p*p <= n:
        if prime_number[p]:
            for i in range(p*p, n+1, p):
                prime_number[i] = False
        p += 1

# def prop_div_sum(n):
#     result = 0
#     for i in range(2, int(n**0.5)+1):
#         if n % i == 0:
#             if i == n / i:
#                 result += i
#             else:
#                 result += i + n / i
#     return int(result + 1) if n != 1 else 0

sieve(100000)

for i in range(2, cache_limit):
    if prime_number[i]:
        print(i, end=", ")
