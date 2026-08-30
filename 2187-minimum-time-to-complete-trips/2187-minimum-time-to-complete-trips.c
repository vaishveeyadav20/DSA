long long minimumTime(int* time, int timeSize, int totalTrips) {
   long long left=time[0],right,mid,res,total,i;
        for(i=1;i<timeSize;i++){
          if(time[i]<left)
          left=time[i]; }  
          right = left * totalTrips;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            total=0;
            for(i=0;i<timeSize;i++)
                total+=mid/time[i];
            if(total>=totalTrips)
            {
                res=mid;
                right=mid-1;
            }
            else
            left=mid+1;
        }
        return res;
}