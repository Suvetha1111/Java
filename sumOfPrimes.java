static int sumOfPrimes(int n)
  {
  boolean prime[]=new boolean[n+1];
Arrays.fill(prime,true);
for(int p=2;p*p<=n;p++)
  {
    if(prime[p]==true)
    {
      for(int i=p*2;i<=n;i+=p)
         prime[i]=false;
    }
  }
int sum=0;
for(int i=2;i<=n;i++)
  if(prime[i])
    sum+=i;
return sum;
}
