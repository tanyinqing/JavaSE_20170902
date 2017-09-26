package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:39 24 Sep 2017
 */
public class Chinese extends Human {

    String hairColor = "black";
    String shengXiao;

    public Chinese(String name) {
        super(name);
    }

    public Chinese(String name, int age, char gender, double height, double weight, boolean married, String shengXiao) {
        super(name, age, gender, height, weight, married);
        this.shengXiao = shengXiao;
    }

    void speakChinese() {

    }

    void eat(String food) { // overwrite 重写  override 覆盖
        System.out.println("吃、" + food);
    }

    int walk(int i) {

        return 1;
    }

    public static void main(String[] args) {
        Chinese chinese = new Chinese("Zhangsan", 18, 'M', 1.7, 70, false, "Tiger");
        System.out.println(chinese.name); // null ""
        System.out.println(chinese.shengXiao);
        System.out.println(chinese.hairColor);
        chinese.study("Java SE");

        chinese.eat("米饭");

        System.out.println(chinese.shengXiao);
        chinese.speakChinese();

        System.out.println(chinese instanceof Human);
        chinese.walk(1);

        Human lisi = new Chinese("Lisi");

        Human human = new Human("");

        System.out.println(human instanceof Chinese);
    }
}