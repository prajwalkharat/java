class reverseString {
    public static void main(String[] args) {
        String str1 = "prajwal";
        String newstr = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            char ch = str1.charAt(i);
            newstr = newstr + ch;
        }
        System.out.println(newstr);  // Output will be "lawjarp"
    }
}

