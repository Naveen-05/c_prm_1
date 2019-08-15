n,k = map(int,input().split())
if n%2==0 :
	n = n+2
else:
	n=n+1
if k%2==0 :
	k = k-2
else:
	k=k-1
for i in range(n,k,2) :
	print(i,end=' ')
print(k)
