
public static String getCompressedString(String str) {
		  StringBuilder ans=new StringBuilder();
			char currChar=str.charAt(0);
			int currLen=1;
			int n=str.length();
			for(int i=1;i <n; i++) {
				if(str.charAt(i)==currChar) {
					currLen++;
				}
				else {
					ans.append(currChar);
					if(currLen>1) {
					ans.append(currLen);
					currLen=1;
					}
					currChar=str.charAt(i);
					}
				if(i == n-1) {
				ans.append(str.charAt(i));
					if(currLen>1) {
						ans.append(currLen);
						}
					
				}
				}
			return ans.toString();
				
			
			}
