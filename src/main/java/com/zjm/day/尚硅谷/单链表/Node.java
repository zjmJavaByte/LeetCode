package com.zjm.day.尚硅谷.单链表;

/**
 * @Author zjm
 * @Description: 单链表实体类
 * @Date: Created in 12:48 2021/9/6
 * @Modified By:
 */
public class Node {

    private Integer no;

    private String name;

    private Integer age;

    public Node next;


    public Integer getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Node(String name, Integer age, Integer no) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
