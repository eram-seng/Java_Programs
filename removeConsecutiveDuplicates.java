public static String removeConsecutiveDuplicates(String str){
   int n=str.length();

   if(n == 0){
    return str;
   }
  
    StringBuilder ans=new StringBuilder();
    char ch=str.charAt(0);
    ans.append(ch);
    for(int i=1; i<n; i++){
        if(str.charAt(i)!= ch){
            ans.append(str.charAt(i));
            ch=str.charAt(i);

        }
    }
    return ans.toString();

    }
