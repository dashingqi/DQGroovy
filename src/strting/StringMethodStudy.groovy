package strting

class StringMethodStudy {
    static void main(String[] args) {

        def str = "groovy Hello"
        // 字符串的填充
        println str.center(9, "1")

        println str.padLeft(9, "a")

        println str.padRight(10, "3")

        // 字符串的比较
        def str_2 = "Hello"
        println str > str_2

        // 获取到字符串中的某一个字符
        println str.getAt(1)
        println(str[1])
        // 还可以传入范围
        println(str[0..1])
        // 减法 ---> groovy (minus方法)
        println(str - str_2)

        // 倒序 ---> olleH yvoorg
        println(str.reverse())

        //字符串的首字母大写
        println(str.capitalize())

        // 字符串是否是数字类型的字符串 --> false
        println(str.isNumber())
    }
}
