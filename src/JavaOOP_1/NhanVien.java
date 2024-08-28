package JavaOOP_1;

public class NhanVien {
    String name;
    int age;
    double salary;
    //Hàm xây dựng có tham số
    public NhanVien(String name, int age, double salary){
        this.name = name;
        this.age =age;
        this.salary = salary;
    }
    public void displayInfo(){
        System.out.println("Tên: "+this.name);
        System.out.println("Tuổi: "+this.age);
        System.out.println("Lương: "+this.salary);
        System.out.println("===========================");
    }

}
