#include<stdio.h>
int num[9] = {60,40,30,24,20,15,12,10,8};
int record[9] = {0};
int index=0;

void print(int track[],int index){
	int i=0;
	for(i=0;i<=index;i++){
		printf("1/%d ",120/track[i]);
	}
	printf("\n");
}
void dfs(int track[],int sum,int dep){
	if(sum==120)
		print(track,index-1);
	
	if(dep==9)
		return;
	
	int i=0;
	for(i=dep;i<9;i++){
		
		if(record[i]==0){
			track[index++] = num[i];
			record[i] = 1;
			sum = sum + num[i];

			dfs(track,sum,i+1);
			record[i] = 0;
			sum = sum - num[i];
			index--;
		}
		
	}
	
}

int main(){
	int track[20];
	dfs(track,0,0);
}
