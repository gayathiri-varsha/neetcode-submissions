class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = flowerbed.length,c=0,l=flowerbed.length;
        if(l==1){
            if(n==0 || (n==1 && flowerbed[0]==0)){
                return true;
            }else{
                return false;
            }
        }
        for(int i=0;i<l;i++){
            
            
            if(flowerbed[i]==0 && l>1){
                int f=0;
                if(i==0 && i+1<l){
                    if(flowerbed[i+1]!=1){
                        f=1;
                    }
                }else if(i==l-1 && l>1){
                    if(flowerbed[i-1]!=1){
                        f=1;
                    }
                }else{
                    if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                        f=1;
                    }
                }
                if(f==1){
                    c++;
                    flowerbed[i]=1;
                }
            }
        }
        System.out.println(c);
            if(n<=c){
                return true;
            }else{
                return false;
            }
        //     if(flowerbed[i]==1){
        //         k--;
        //         if(i==0 || i== flowerbed.length - 1){
        //             k--;
        //         }else{
        //             k-=2;
        //         }
        //     }else{
        //         if()
        //     }
        // }
        // if(n<=k/2 || n==0){
        //     return true;
        // }
       
        // return false;
        }
}