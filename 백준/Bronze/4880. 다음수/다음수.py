import sys

def solve():
    results = []

    for line in sys.stdin:
        a1, a2, a3 = map(int, line.split())
        
        if a1 == 0 and a2 == 0 and a3 == 0:
            break
        
        if (a2 - a1) == (a3 - a2):
            diff = a2 - a1
            results.append(f"AP {a3 + diff}")
        
        else:
            ratio = a2 // a1
            results.append(f"GP {a3 * ratio}")

    for result in results:
        print(result)

if __name__ == "__main__":
    solve()