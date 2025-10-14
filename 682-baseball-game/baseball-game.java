class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack= new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int last = stack.pop();
                int secondLast = stack.peek();
                int sum = last + secondLast;
                stack.push(last);
                stack.push(sum);
            } else if(op.equals("D")){
                stack.push(stack.peek()*2);
            } else if(op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        for(int score : stack){
            total+=score;
        }
        return total;
    }
}