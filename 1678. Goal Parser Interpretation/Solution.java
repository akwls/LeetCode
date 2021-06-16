class Solution {
    public String interpret(String command) {
        String answer = "";
        answer = command.replace("()", "o");
        answer = answer.replace("(", "");
        answer = answer.replace(")", "");
        return answer;
    }
}