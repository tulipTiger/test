package testData;

/**
 * Description: <测试数据 学生类>
 *
 * @author tulip丿yu
 * @create 2019/2/26
 * @since 1.0.0
 */
public class Student {

    private String name;
    private int age;
    private int sex;

    public Student(){

    }

    public Student(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
