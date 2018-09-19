import spock.lang.Specification
import spock.lang.Unroll

class MathUtilsTest extends Specification {

    @Unroll
    def "Maximum of the numbers"() {
        expect:
        MathUtils.getMaxNumber(numbers) == max

        where:
        numbers      | max
        [1, 2, 3, 4] | 4
        [1, 3, 5, 7] | 4 //Wrong case
        [2, 4, 6, 8] | 8
    }

    @Unroll
    def "Maximum of the numbers 2"() {
        expect:
        MathUtils.getMaxNumber(numbers) == max

        where:
        numbers << [[1, 2, 3, 4], [1, 3, 5, 7], [2, 4, 6, 8]]
        max << [4, 4, 8]
    }
}
