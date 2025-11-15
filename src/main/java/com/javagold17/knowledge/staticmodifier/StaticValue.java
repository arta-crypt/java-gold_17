package main.java.com.javagold17.knowledge.staticmodifier;

/**
 * static修飾子とインスタンス変数のアクセス挙動の違いを検証するテストクラス。
 * <p>
 * このクラスは、null参照を通じてstatic変数にアクセス可能であることを示します。
 * </p>
 */
class Test {
    /** このクラスの全インスタンスで共有されるstatic変数 */
    static String staticValue = "staticValue";

    /** インスタンス固有のインスタンス変数 */
    String instanceValue = "instanceValue";
}

/**
 * static修飾子の動作確認を行うメインクラス。
 * <p>
 * null参照を通じてstatic変数へのアクセスが可能であることを実演し、
 * インスタンス変数へのアクセスとの違いを示します。
 * </p>
 */
public class StaticValue {
    /**
     * static変数とインスタンス変数の挙動の違いを検証するメインメソッド。
     * <p>
     * null参照であってもstatic変数にはアクセス可能ですが、
     * インスタンス変数へのアクセスはNullPointerExceptionを引き起こします。
     * </p>
     * 
     * @param args コマンドライン引数（使用されません）
     */
    public static void main(String[] args) {
        Test t1 = null;

        // static変数はクラス変数であり、インスタンスを経由しても
        // null参照を通じてアクセス可能です
        System.out.println(t1.staticValue);

        // インスタンス変数はnull参照を通じてアクセスできないため
        // NullPointerExceptionが発生します
        System.out.println(t1.instanceValue);
    }
}
