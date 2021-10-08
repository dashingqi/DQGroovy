package 逻辑控制

class StructStudy {

    static void main(String[] args) {

        // switch case
        def x_1 = 1.245
        def result

        switch (x_1) {
            case "foo":
                result = "found foo"
                break
            case "bar":
                result = "bar"
                break
            case [1.245, 4, 5, 6, 7, "sss"]:
                result = "list"
                break
            case 12..30:
                result = 'range'
                break
            case Integer:
                result = "integer"
                break
            case BigDecimal:
                result = "big decimal"
                break
            default: {
                result = "default"
                break
            }
        }

        println(result)

        // for循环

        /**
         * 对于范围的循环遍历
         */

        def sum_1 = 0
        for (i in 5..20) {
            sum_1 = +i
        }
        println("sum_1 = $sum_1")

        /**
         * 对于list的循环遍历
         */
        def sum_2 = 1

        for (i in [1, 2, 3, 4, 5, 6, 7]) {
            sum_2 += i
        }
        println("sum_2 = $sum_2")

        /**
         * 对于map的循环遍历
         */

        def sum_3 = 0
        for (i in ["zhangqi": 0, "zhang": 1]) {
            sum_3 += i.value
        }

        println("sum_3 = $sum_3")

    }
}
