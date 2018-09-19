import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class DemoSpec extends Specification {
    @Shared
    int d

    void setupSpec() {
        println "Run before the first feature method"
        d = 1
    }

    void cleanupSpec() {
        println "Run after the last feature method"
    }

    void setup() {
        println "Run before every feature method"
    }

    void cleanup() {
        println "Run after every feature method"
    }

    @Unroll
    void "Test function 1"() {
        expect:
        a + b == ++d

        where:
        a | b
        1 | 1
        1 | 2
        1 | 4 //Wrong case
    }

    void "Test function 2"() {
        expect:
        a + b == d

        where:
        a | b
        1 | 3
    }


}