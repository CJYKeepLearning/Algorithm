/************begin************/
#include <stdio.h>
int cmn(int n,int m)
{
	int dp[n-m+1]={0};
	dp[0]=1;
	int i=0;
	for(i=1;i<n-m+1;i++){
		dp[i] = (dp[i-1]*(i+m))/i;
	}
	printf("%d",dp[n-m]);

}
int main()
{
	int n,m;
	printf("请输入n和m(n>m)：");
	scanf("%d,%d",&n,&m); //接收键入的数值
	cmn(n,m);

}
/************end************/


