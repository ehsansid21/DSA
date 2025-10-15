class Solution {
public:
    string clearDigits(string s) {
        string stack;
        for (char ch : s) {
            if (isdigit(ch)) {
                if (!stack.empty()) {
                    stack.pop_back(); 
                }
              
            } else {
                stack.push_back(ch); 
            }
        }
        return stack;
    }
};