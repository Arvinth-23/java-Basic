/*This program is to check whether in the given array prefix charaters are same  */
class leet12 {
    public String longestCommonPrefix(String[] strs) {
        String ans ="";
        Arrays.sort(strs);
        String first =strs[0];
        String last =strs[strs.length-1];
        for (int i =0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans =ans + first.charAt(i);
            }
            else{
                break;
            }

        }
        return ans;
    }
}