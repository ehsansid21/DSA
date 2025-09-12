class Solution {
    public boolean doesAliceWin(String s) {
        boolean flag=false;
        for (char c:s.toCharArray()){
        if("aeiou".indexOf(c)!=-1)
        {
        return true;
        }
    }
       return false;
        
    }
}