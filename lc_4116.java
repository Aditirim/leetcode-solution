//4116. Assign Umbrella on Rainy Days

class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String[] res=new String[n];
        int ac=0,bc=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && rain[i]==1 && rain[i+1]==1){
                if(ac<=bc){
                res[i]="Alice";
                    ac++;
                }
                else if(ac>bc){
                res[i]="Bob";
                    bc++;
                }
            }
            else if(rain[i]==1){
                res[i]="Bob";
                bc++;
            }
            else{
                res[i]="None";
            }
        }
        return res;
    }
}