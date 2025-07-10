public static String removeAllOccurrencesOfChar(String str, char ch){

    int n=str.length();

    if(n == 0){
        return str;

    }

    StringBuilder ans= new StringBuilder();
    for(int i=0; i<n; i++){

        if(str.charAt(i) == ch){
            continue;
        }
        ans.append(str.charAt(i));

    }
    return ans.toString();
    

}