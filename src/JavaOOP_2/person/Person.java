package JavaOOP_2.person;

public class Person {
    String name;
    int age;
    String gender ;
    String address ;
    String phone ;

    public String getPhone() {
        return phone;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public String getGender() {
        return gender;
    }



    public String getAddress() {
        return address;
    }


    //Hàm xây dựng
    public Person(String name, int age, String gender, String address, String phone)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public Person(){

    }
    //Hàm in thông tin người dùng
    public void showInformation(){
        System.out.println(name+", "+age+", "+gender+", "+address+", "+phone);
    }

}
