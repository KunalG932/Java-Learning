class Student {
    static void p(Object obj) {
        System.out.println(obj);
    }
    
    public static void main(String[] args) {
        String s = "Hello, World!";
        p(s);
        p("This is much shorter!");
        p(42+34);
        p("Easy to use!");
    }
}