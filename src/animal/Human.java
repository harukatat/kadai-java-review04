package animal;

public class Human extends Animal implements Thinkable {
    private String humanTaste; // 趣味

    // 引数なしのコンストラクタ
    public Human() {
    }

    // 引数ありのコンストラクタ
    public Human(String humanName, int humanAge, String humanTaste) {
        super.setHumanName(humanName);
        super.setHumanAge(humanAge);// スーパークラス(Animal)のコンストラクタを呼び出し
        this.humanTaste = humanTaste;
    }

    public void setHumanTaste(String humanTaste) {
        this.humanTaste = humanTaste;
    }
        @Override
        public void think() {
            System.out.println("私は"+ humanTaste +"について考えています");
    }

}
