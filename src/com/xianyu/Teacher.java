package com.xianyu;

public class Teacher extends User{
  private int age;
  private String grade;

  public Teacher(){
    super();
  }

  public Teacher(int id, String name, String password, int age, String grade) {
    super(id, name, password);
    this.age = age;
    this.grade = grade;
  }

  public void teach(){
    System.out.println(this.getName() + "在给学生上课");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
