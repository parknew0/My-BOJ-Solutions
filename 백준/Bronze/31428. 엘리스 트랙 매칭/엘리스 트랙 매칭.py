import sys

n = int(sys.stdin.readline())
friends_tracks = sys.stdin.readline().split()
hellobit_track = sys.stdin.readline().strip()

print(friends_tracks.count(hellobit_track))