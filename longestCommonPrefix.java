
class Solution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        //Sort the array
        Arrays.sort(strs);

        //Frist and Last String
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        //Traverse to compare
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();

    }
}
