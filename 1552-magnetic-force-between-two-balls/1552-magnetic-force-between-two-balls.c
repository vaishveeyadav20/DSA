int compare_integers(const void*a, const void*b){
    return(*(int*)a - *(int*)b);
}
int maxDistance(int* position, int n, int m) {
   int left=1,right,mid,i;
   long long res,previous;
   int balls=1;
   qsort(position,n,sizeof(int),compare_integers);
   right=position[n-1]-position[0];
   while(left<=right)
 {
    mid=left+(right-left)/2;
    balls=1;
    previous=position[0];
    for(i=1;i<n;i++)
    {
      if((position[i]-previous)>=mid)
        {
            balls+=1;
            previous=position[i];
        }
    } 
    if(balls>=m)
    {
        left=mid+1;
        res=mid;
    }
    else
     right=mid-1;
 }
 return res;
}