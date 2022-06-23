package chapter12.annotation;

public @interface TestInfo {
    int count();

    String testedBy();

    String[] testTools();

    TestType testType();

    DateTime testDate();
}
