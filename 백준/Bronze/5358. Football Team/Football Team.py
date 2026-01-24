import sys

def solve():
    for line in sys.stdin:
        line = line.rstrip('\n')
        result = []
        for char in line:
            if char == 'i':
                result.append('e')
            elif char == 'e':
                result.append('i')
            elif char == 'I':
                result.append('E')
            elif char == 'E':
                result.append('I')
            else:
                result.append(char)
        print("".join(result))

if __name__ == "__main__":
    solve()