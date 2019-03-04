package collection_ex.list;

import org.junit.Test;
import testData.Student;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description: <Arraylist 练习复习>
 *
 * @author tulip丿yu
 * @create 2019/2/26
 * @since 1.0.0
 */
public class ArrayListEx {

    public static void main(String[] args) {
    }

    @Test
    public void fun1(){
        // 创建 一个  collection 对象
        Collection collection = new ArrayList();
        // 创建 student 对象 ，并将 其添加到 collection 集合中
        for (int i = 0; i < 5; i++) {
            Student student = new Student("tiger" + i, i, +i);
            collection.add(student);
        }
        // 通过 toArray() 遍历集合
        collection.toArray();
       
        // 通过 iterator 遍历
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println(student.getAge());
            student.setAge(1);
        }

        Iterator iterator2 = collection.iterator();
        while(iterator2.hasNext()){
            Student student = (Student) iterator2.next();
            System.out.println(student.getAge());
        }
    }

}
