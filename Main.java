public class Main {
    public static void main(String[] args) {

        String target = "()[]{}";
        boolean isValid = false;
        int start;
        int end;

        for(int i = 0; i < target.length(); i++) {
            start = i;
            end = start + 1;
            if(target.charAt(start) == '(') {
                if(target.charAt(end) == ')') {
                    isValid = true;
                }
                else {
                    isValid = false;
                    break;
                }
            } else if (target.charAt(start) == '{') {
                if(target.charAt(end) == '}') {
                    isValid = true;
                }
                else {
                    isValid = false;
                    break;
                }
            } else if (target.charAt(start) == '[') {
                if (target.charAt(end) == ']') {
                    isValid = true;
                }
                else {
                    isValid = false;
                    break;
                }
            }
        }

        System.out.println(isValid);

    }

}