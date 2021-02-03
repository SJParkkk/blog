package anno;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

@Target({FIELD, TYPE, TYPE_USE})
public @interface DemoTargetAnno {}
@DemoTargetAnno// 적용대상 TYPE
class TestClass{
    @DemoTargetAnno// 적용 대상 FIELD
    int i;
    @DemoTargetAnno// 적용 대상 TYPE_USE : TYPE 이 사용되는 모든곳
    TestClass tc;
}

