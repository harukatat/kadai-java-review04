package animal;

public class Animal {

 // フィールド
    private String humanName;// 名

    private int humanAge;// 年齢

    // コンストラクタ
    public  Animal() {
    }
    // 引数ありコンストラクタ
    public  Animal(String humanName, int humanAge) {
this.humanName = humanName;
this.humanAge = humanAge;
    }
    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }

    // 自己紹介をするメソッド
    public void say() {

        System.out.println(humanName +"です" );
        System.out.println(humanAge  +"歳です");
    }
}
