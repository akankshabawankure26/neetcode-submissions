class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        for(String s : operations){
            char ch = s.charAt(0);

            if(ch == 'D'){
                st.push(st.peek() * 2);
            }else if(ch == 'C'){
                st.pop();
            }else if(ch == '+'){
                int num = st.pop();
                int sum = num + st.peek();
                st.push(num);
                st.push(sum);
            }else{
                st.push(Integer.parseInt(s));
            }
        }

        int ans = 0;
        while(!st.empty()){
            ans += st.pop();
        }

        return ans;
    }
}