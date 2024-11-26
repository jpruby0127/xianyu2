package com.xianyu;

public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");

    Student xianyu = new Student();
    xianyu.setName("咸鱼");
    Teacher jpruby = new Teacher();
    jpruby.setName("jpruby");
    xianyu.study();
    xianyu.sing("我爱你中国");
    jpruby.teach();
    jpruby.sing("我爱共产党");

  }

  private static int getRes2(int from, int to) {
    int res = 0;
    for (int i = from; i <= to; i++) {
      res+=i;
    }
    return res;
  }

  private static int getRes() {
    int res = 0;
    for (int i = 0; i <= 100; i++) {
      res+=i;
    }
    return res;
  }
}
