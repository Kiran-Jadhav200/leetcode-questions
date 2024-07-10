class Solution {
    public boolean checkIfPangram(String sec) {
        boolean b= true;
        if(sec.length()<26) b = false;
        else{
            for(char ch ='a' ;ch<='z'; ch++){
                if(sec.contains(String.valueOf(ch))){
                    b =true;
                }
                else{
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}