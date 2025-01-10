class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] a= new int[num_people];
        int b=0;
        int i=0;
        for(int j=candies; j>0; j=j-b){
            b=b+1;
            if(i==num_people){
                i=i-num_people;
            }
            if(b<=j){
            a[i]=a[i]+b;
            }
            else{
                a[i]=a[i]+j;
            }
            i=i+1;
        }
        return a;
    }
}
