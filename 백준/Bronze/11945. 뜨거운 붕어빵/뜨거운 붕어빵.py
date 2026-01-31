import sys

row, col = map(int, sys.stdin.readline().split())

matrix = []

for i in range(row):
    line = sys.stdin.readline().strip()
    reversed_line = line[::-1]
    matrix.append(reversed_line + '\n')

sys.stdout.writelines(matrix)