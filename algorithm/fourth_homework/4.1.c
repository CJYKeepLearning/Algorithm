#include<stdio.h>
void max_min(int a[],int m,int n,int *min1,int *min2,int *max1,int *max2);
NONO();
/************begin************/

void max_min(int a[],int m,int n,int *min1,int *min2,int *max1,int *max2)
{

	int i=0,j=0;
	*min1=a[m];
	*min2=a[m];
	*max1=a[m];
	*max2=a[m];
	for(i=m;i<n;i++){
		if(*min1>a[i])
			*min1=a[i];
		if(*max1<a[i])
			*max1=a[i];
	}
	for(i=m;i<n;i++){
		if((a[i]==*min1) || (a[i]==*max1))
			continue;
		if(*min2>a[i])
			*min2=a[i];
		if(*max2<a[i])
			*max2=a[i];
	}
}

int main()
{
	int k=0,i=0;
	int a[100];
	printf("一共k个数! k=");
	scanf("%d",&k);
	for(i=0;i<k;i++){
		scanf("%d",&a[i]);
	}
	int m=0,n=0;
	n=k;
	int min1=0;
	int min2=0;
	int max1=0;
	int max2=0;
	max_min(a,m,n,&min1,&min2,&max1,&max2);
	printf("%d %d %d %d",min1,min2,max1,max2);
	
/************end************/
	NONO();
    return 0;
}

NONO()
{// 本函数用于打开文件，输入数据，调用函数，输出数据，关闭文件。 
  FILE *in, *out ;
  int i,j,k,s[100]={0};
  int min1,min2,max1,max2;
  in = fopen("in5.dat", "r")  ;
  out = fopen("out5.dat", "w") ;
  for(i=0;i<3;i++)
  {  
		fscanf(in, "%d", &k) ;
		for(j = 0 ; j < k ; j++) 
		{
			fscanf(in, "%d", &s[j]) ;
		}

		max_min(s,0,k-1,&min1,&min2,&max1,&max2);
		fprintf(out, "%d,%d,%d,%d,\n", min1,min2,max1,max2) ;    
  }
  fclose(in) ;
  fclose(out) ;
}

