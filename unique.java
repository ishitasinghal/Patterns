class Unique
{
static void dash(int k)
{
for(int i=1;i<=k;i++)
{
System.out.print("-");
}
}

static void pat(int n)
{
int r,c,d=0;
int dashno=0;
int value=1;
int k,l,dec=0;
int col=0;
int s=n-1;
int temp1=((n*n)+1);
int temp2=((n*2)-1);
int z=temp1;
int t=0;
for(int i=1;i<=n;i++)
{
dash(dashno);
for(int j=1;j<=(2*n)-dashno;j++)
{
if(j%2==0)
System.out.print("*");
else{
System.out.print(value);
value=value+1;
}
}
for(k=1;k<=(temp2-dec);k++)
{
if(k%2==0)
System.out.print("*");
else{
if(k==1)
t=temp1;
System.out.print(temp1);
temp1++;
}
}
dec=dec+2;
temp1=t-s;
s--;
dashno=dashno+2;
System.out.println();
}
}

public static void main(String args[]){
int n=3;
pat(n);
}
}

