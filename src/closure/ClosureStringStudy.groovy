package closure

class ClosureStringStudy {
    static void main(String[] args) {

        // 字符串与闭包的结合使用
        String str_1 = "the 2 and 4 is 6"

        // each的遍历
        def result_0 = str_1.each {
            String temp ->
                println("temp is $temp")
        }
        println("result_0 is $result_0")

        // find 用来查找符合条件的第一个
        def str = str_1.find {
            String s -> s.isNumber()
        }

        println("str is $str")

        // findAll 找到所有符合条件的字符，并以集合的形式返回
        def list = str_1.findAll {
            String s -> s.isNumber()
        }
        println("list is $list")

        // 用于判断字符串是否部分满足某种条件的
        def result = str_1.any {
            String s -> s.isNumber()
        }
        println("result is $result")

        // 用于判断字符串是否都满足这个条件
        def result_1 = str_1.every {
            String s -> s.isNumber()
        }
        println("result_1 is $result_1")


        // 循环遍历字符串中的每一个字符,并可以将操作的结果返回成一个list集合
        def upperCase = str_1.collect {
            it.toUpperCase()
        }
        println("upperCase is ${upperCase.toListString()}")
    }
}
