
public class LongestPalindromicSubstring {
	public static void main(String[] args){
		LongestPalindromicSubstring c=new LongestPalindromicSubstring();
		long start = System.currentTimeMillis();
		String s2="kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
		String s5="abcbadda";
		String s1="abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
		String s3="vaomxdtiuwqlwhgutkhxxhccsgvyoaccuicgybnqnslogtqhblegfudagpxfvjdacsxgevvepuwthdtybgflsxjdmmfumyqgpxatvdypjmlapccaxwkuxkilqqgpihyepkilhlfkdrbsefinitdcaghqmhylnixidrygdnzmgubeybczjceiybowglkywrpkfcwpsjbkcpnvfbxnpuqzhotzspgebptnhwevbkcueyzecdrjpbpxemagnwmtwikmkpqluwmvyswvxghajknjxfazshsvjkstkezdlbnkwxawlwkqnxghjzyigkvqpapvsntojnxlmtywdrommoltpbvxwqyijpkirvndwpgufgjelqvwffpuycqfwenhzrbzbdtupyutgccdjyvhptnuhxdwbmdcbpfvxvtfryszhaakwshrjseonfvjrrdefyxefqfvadlwmedpvnozobftnnsutegrtxhwitrwdpfienhdbvvykoynrsbpmzjtotjxbvemgoxreiveakmmbbvbmfbbnyfxwrueswdlxvuelbkrdxlutyukppkzjnmfmclqpkwzyylwlzsvriwomchzzqwqglpflaepoxcnnewzstvegyaowwhgvcwjhbbstvzhhvghigoazbjiikglbqlxlccrwqvyqxpbtpoqjliziwmdkzfsrqtqdkeniulsavsfqsjwnvpprvczcujihoqeanobhlsvbzmgflhykndfydbxatskf";
		String s4="nmngaowrbsssvihklwmuqshcddwlxrywrlwtennwfvrevgvhsvgeccfulmuvrcksdmgeqrblnlwoepefhcwhmgyvgcoyyygrmttyfycxwbqktpurlcfhzlakhmrddsydgygganpmaglaxyhfwjusukzcnakznygqplngnkhcowavxoiwrfycxwdkxqfcjqwyqutcpyedbnuogedwobsktgioqdczxhikjrbkmqspnxcpngfdwdaboscqbkwforihzqdcppxjksiujfvlpdjryewaxgmdgigvxdlstxwngtbdrrkfudjinzyxbdmkautclvvyguekuzwwetmsxittgtxbnvvrgasvnlogdiepltweaehubwelznidltzlbzdsrxmhjpkmylnwkdsxnpkplkdzywioluaqguowtbaoqzqgjfewphqcvlnwlojbxgomvxxkhwwykawegxubjiobizicuxzeafgautefsurgjlbhcfevqzsbhwxycrcaibdsgluczcuewzqupakbzmcvzsfodbmgtugnihyhqkvyeboqhqldifbxuaxqzxtyejoswikbzpsvzkxcndgeyvfnyrfbkhlalzpqjueibnodamgpnxlkvwvliouvejcpnakllfxepldfmdzszagkyhdgqqbkb";
		Solution s=c.new Solution();
//		System.out.println(s.longestPalindrome3(s1));
		System.out.println(s.longestPalindrome3(s2));
		System.out.println(s.longestPalindrome3(s3));
		System.out.println(s.longestPalindrome3(s4));
		System.out.println(s.longestPalindrome(s5));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
		
		public String longestPalindrome3(String s) {
	        String res = "";
	        int currLength = 0;
	        for(int i=0;i<s.length();i++){
	            if(isPalindrome(s,i-currLength-1,i)){
	                res = s.substring(i-currLength-1,i+1);
	                currLength = currLength+2;
	            }
	            else if(isPalindrome(s,i-currLength,i)){
	                res = s.substring(i-currLength,i+1);
	                currLength = currLength+1;
	            }
	        }
	        return res;
	    }

	    public boolean isPalindrome(String s, int begin, int end){
	        if(begin<0) return false;
	        while(begin<end){
	            if(s.charAt(begin++)!=s.charAt(end--)) return false;
	        }
	        return true;
	    }
		
		public String longestPalindrome2(String s) {
	    	if(s.length()<2) return s;
	    	int i=0,j=s.length()-1;
	    	int begin=0, end=s.length();
	    	String result="";
	    	String mid="";
//	    	Stack 
	    	while(i<=j){
	    		if(i==j){
	    			mid=s.charAt(i)+mid;
	    		}
	    		else{
		    		if(s.charAt(i)==s.charAt(j)){
//		    			String temp=recursive(s,i+1,j-1,map);
		    			result+=s.charAt(i);
		    			i++;j--;
		    			continue;
		    		}else{
		    			begin=++i;
		    			
		    		}
		    	}
	    	}	
	    	return null;
	    }
		
	    public String longestPalindrome(String s) {
	    	if(s.length()<2) return s;
	        String[][] map=new String[s.length()][s.length()];
	        for(int i=0;i<s.length();i++){
	        	for(int j=0;j<s.length();j++){
	        		map[i][j]="";
	        	}
	        }
	    	return recursive(s,0,s.length()-1,map);
	    }
	    public String recursive(String s, int i, int j, String[][]map){
	    	if(!map[i][j].isEmpty()) return map[i][j];
	    	String result="";
	    	if(i==j) result+=s.charAt(i);
	    	else if(i==j-1){
	    		result= s.charAt(i)==s.charAt(j) ? result+s.charAt(i)+s.charAt(j) : "-1";
	    	}else{
	    		if(s.charAt(i)==s.charAt(j)){
	    			String temp=recursive(s,i+1,j-1,map);
	    			int len=temp.equals("-1") ? 0 :temp.length();
    				if(temp.equals("-1")) result="-1";
	    			else if(len!=j-i-1){
	    				String temp1=recursive(s,i+1,j,map);
		    			String temp2=recursive(s,i,j-1,map);
		    			int len1= temp1.equals("-1") ? 0 :temp1.length();
		    			int len2= temp2.equals("-1") ? 0 :temp2.length();
		    			if(len1>len) temp=temp1;
	    				if(len2>len1) temp=temp2;
	    				result=temp;
	    			}else{
	    				result=s.charAt(i)+temp+s.charAt(j);
	    			}
	    		}else{
	    			String temp1=recursive(s,i+1,j,map);
	    			int len1= temp1.equals("-1") ? 0 :temp1.length();
	    			if(temp1.length()!=j-i-2){
	    				String temp2=recursive(s,i,j-1,map);
		    			int len2= temp2.equals("-1") ? 0 :temp2.length();
	    				if(len2>len1) temp1=temp2;
	    			}
	    			result= temp1;
	    		}
	    	}
	    	map[i][j]=result;
	    	return result;
	    }
	}
}
