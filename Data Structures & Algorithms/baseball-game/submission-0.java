class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(String op:operations){
            if(op.equals("+")){
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            int score=a+b;
            st.push(score);
            sum+=score;
            }
            else if(op.equals("D")){
                int score=2*st.peek();
                st.push(score);
                sum+=score;
            }
            else if(op.equals("C")){
                sum-=st.pop();
            }
            else {
                int score =Integer.parseInt(op);
                st.push(score);
                sum+=score;
            }

        }
        return sum;
    }
}