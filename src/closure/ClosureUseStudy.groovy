package closure

class ClosureUseStudy {

    static void main(String[] args) {
        println("upTo ${fab_1(5)}")
        println("downTo ${fab_2(5)}")
    }

    // 计算 1到 number 阶乘的和
    static int fab_1(int number) {
        int result = 1
        1.upto(number) {
            result *= it
        }
        return result
    }

    // 计算 number 到 1阶乘的和
    static int fab_2(int number) {
        int result = 1
        number.downto(1) {
            result *= it
        }
        return result
    }
}
