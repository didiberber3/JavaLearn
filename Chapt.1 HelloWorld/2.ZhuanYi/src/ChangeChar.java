public class ChangeChar {

    public static void main(String[] args) {
        // \t 制表符 对齐
        System.out.println("北京\t天津\t上海");

        // \n 换行符
        System.out.println("Jackie\nJason\nSmith");

        // \\ 斜杠符
        System.out.println("Call\\Me\\Alex");
        System.out.println("Call\\\\Me\\\\Steve");
        // \'
        System.out.println("Call\'Me\'Smoggy");
        // \\" 斜杠符
        System.out.println("Call\"Me\"Carbon");
        // \r 回车符
        // 解读 输出Call /r 表示回车 无换行，替换成Me - 替换成Donk
        System.out.println("Call\rMe\rDonk");
    }
}