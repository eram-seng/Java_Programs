public static char highestOccuringChar(String str){

    str= str.toLowerCase();
    int n= str.length();

    if(n == 0){
        return '\0';
    }

    int[] frequency=new int[256];
    int maxFrequency=Integer.MIN_VALUE;

    for(int i=0; i<n; i++){
        frequency[str.charAt(i)]++;
        maxFrequency=Math.max(frequency[str.charAt(i)], maxFrequency);
    }

    char ans='\0';

    for(int i=0; i<256; i++){
        if(frequency[i] == maxFrequency){
            ans= (char) i;
            break;

        }

    }
    return ans;

}