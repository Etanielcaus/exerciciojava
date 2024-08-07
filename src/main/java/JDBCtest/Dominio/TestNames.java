package JDBCtest.Dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class TestNames {
    Integer id;
    String name;

//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TestNames testNames = (TestNames) o;
//        return Objects.equals(id, testNames.id) && Objects.equals(name, testNames.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//
//    public static final class TestNamesBuilder {
//        private Integer id;
//        private String name;
//
//        private TestNamesBuilder() {
//        }
//
//        public static TestNamesBuilder builder() {
//            return new TestNamesBuilder();
//        }
//
//        public TestNamesBuilder withId(Integer id) {
//            this.id = id;
//            return this;
//        }
//
//        public TestNamesBuilder withName(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public TestNames build() {
//            TestNames testNames = new TestNames();
//            testNames.id = this.id;
//            testNames.name = this.name;
//            return testNames;
//        }
//    }
}
