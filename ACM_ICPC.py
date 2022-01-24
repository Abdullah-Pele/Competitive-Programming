import sys
#https://codeforces.com/problemset/problem/886/A 
 
arr = list(map(int , input().split(' ')))
sums = sum(arr)
# arr.sort()
 
 
 
for i in range(6):
    for j in range(i+1,6):
        for k in range(j+1,6):
            if (arr[i]+arr[j]+arr[k]) == sums/2:
                print("YES")
                sys.exit()
 
print('NO')
