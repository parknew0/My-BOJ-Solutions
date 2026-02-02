import sys

r, c, n = map(int, sys.stdin.readline().split())

if r % n == 0:
    row_count = r // n
else:
    row_count = r // n + 1

if c % n == 0:
    col_count = c // n
else:
    col_count = c // n + 1

print(row_count * col_count)