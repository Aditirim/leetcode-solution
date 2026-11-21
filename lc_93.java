//93. Restore IP Addresses

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<>();
        solve(0,s,res,new ArrayList<String>());
        return res;
    }
    public static void solve(int index,String s,List<String> res,List<String> parts){
        if(parts.size()==4){
            if(index==s.length()){
                res.add(String.join(".",parts));
            }
            return;
        }
        for(int len=1;len<=3;len++){
            if(index+len>s.length()){
                break;
            }
            String segment=s.substring(index,index+len);
            if(segment.length()>1 && segment.charAt(0)=='0')
            break;
            if(Integer.parseInt(segment)>255)
            break;
            parts.add(segment);
            solve(index+len,s,res,parts);
            parts.remove(parts.size()-1);
        }
    }
}