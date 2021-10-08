package strting

class Variable {
    static void main(String[] args) {
//        int x = 10
//        println x.class
//
//        double y = 3.14
//        println y.class
//
//        def z = "Hello Groovy"
//        def c = 12

        def s_1 = "Hello Groovy"
        println s_1.class

        def s_2 = 'Hello Groovy'
        println s_2.class

        def s_3 = '''\
        Hello Groovy
        public class Hello{
            static void main(){
            }
        }
'''
        println s_3



        def s_4 = "android"
        def s_5 = "hello ${s_4}"
        println(s_5)
        println(s_5.class)

        def result = echo(s_5)
        println(result)
    }

    static String echo(String message) {
        return message
    }
}
