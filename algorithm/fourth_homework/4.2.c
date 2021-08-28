#include<stdio.h>
int max(int a[][7],int i,int j);
int main(){
	int arr[7][7]={
	{16,4,3,12,6,0,3},
	{4,-5,6,7,0,0,2},
	{6,0,-1,-2,3,6,8},
	{5,3,4,0,0,-2,7},
	{-1,7,4,0,7,-5,6},
	{0,-1,3,4,12,4,2}
	};
	int i=0,j=0;
	int dp[7][7]={{16,4,3,12,6,0,3}};
	for(i=1;i<7;i++){
		for(j=0;j<7;j++){
			dp[i][j] = max(dp,i,j)+arr[i][j];
		}
	}
	printf("最大路径和是%d",dp[6][3]);
}
int max(int a[][7],int i,int j){
	int k=-2;
	int max=0;
	for(k=-2;k<=2;k++){
		if((j+k)<0 || (j+k)>6)
			continue;
		if(max<a[i-1][j+k]){
			max = a[i-1][j+k];
		}
	}
	return max;
}
