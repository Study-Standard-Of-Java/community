package chapter12.annotation;

@TestInfo(
        count = 3,
        testedBy = "Kim",
        testTools = {"Junit", "AutoTester"},
        testType = TestType.FINAL,
        testDate = @DateTime(yymmdd = "160101", hhmmss = "235959")
)
public class TestAnnotation {
}
