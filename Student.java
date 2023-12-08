class Student {
    String name;
    int roll;
    int Age;
    void info(){
        System.out.println("Name:"+name);
        System.out.println("roll no:"+roll);
        System.out.println("Age:"+Age);
    }
    public static void main(String[]args) {
        Student stu=new Student();
    // stu.name = "sarthak";
    // stu.roll = 1282;
    // stu.Age = 20;
    
    stu.info();
        
    }
}
