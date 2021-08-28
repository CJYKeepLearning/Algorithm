/************begin************/
#include <stdio.h>
int mark[256];
int index=0;
/*
void DFS(int sum,int k, int prio, int n) {
	if(sum>n) {
		return;
	} else if(sum == n) {
		int i;
		for( i = 0; i < k-1; i++) {
			printf("%3d",mark[i]);
		}
		printf("%3d\n",mark[i]);
	} else {
		int j=0;
		for(j=prio; j > 0; j--) {
			mark[k] = j;
			sum += j;
			DFS(sum,k+1,j,n);
			sum -= j;  //恢复现场
		}
	}
}
*/
void dfs(int prio,int sum){
	if(sum==6){
		int i=0;
		for(i=0;i<=index;i++)
			printf("%3d",mark[i]);
	}
	
	if(sum>6)
		return;
	
	int i=0;
	for(i=prio;i>0;i--){
		mark[index] = i;
		sum += i;
		dfs(prio+1,sum,i)
		
	}
	
	
	
}
int divide(int n,int m){
	if(n==1 || m==1){
		return 1;
	}
	else if(n<m){
		return divide(n,n);
	}
	else if(n==m){
		return divide(n,m-1)+1;
	}
	else{
		return  divide(n,m-1)+divide(n-m,m);
	}
}  

int main()
{
	int n;
	printf("n=");
	scanf("%d",&n);  //获取键入的n的数值
	if(n<=100){
		//DFS(0,0,n,n);
		printf("total=%d\n",divide(n,n));
	}
}







































/************end************/
