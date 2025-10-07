package ICP.Assignment8;

import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");
        for (String i : directories) {
            if (i.equals(".") || i.isEmpty()) { 
                continue;
            } else if (i.equals("..")) { 
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else { 
                stack.push(i);
            }
        }
        return "/" + String.join("/", stack);
    }
}