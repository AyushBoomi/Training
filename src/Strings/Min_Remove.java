package Strings;


//Given a string s of '(' , ')' and lowercase English characters.
//
//Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
//
//Formally, a parentheses string is valid if and only if:
//
//It is the empty string, contains only lowercase characters, or
//It can be written as AB (A concatenated with B), where A and B are valid strings, or
//It can be written as (A), where A is a valid string.
public class Min_Remove {

        public String minRemoveToMakeValid(String s) {

            int[] st=new int[100001];
            int k=-1;


            char[] arr=s.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='('){
                    st[++k]=i;
                }
                else if(arr[i]==')'){
                    if(k==-1)
                        arr[i]='#';
                    else
                        --k;

                }

            }



            while(k!=-1){

                arr[st[k--]]='#';

            }


            StringBuilder ans = new StringBuilder();
            for (char c : arr) {
                if (c != '#') {
                    ans.append(c);
                }
            }
            return ans.toString();


        }

    public static void main(String[] args) {

    }

}
