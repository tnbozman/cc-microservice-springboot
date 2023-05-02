package {{cookiecutter.package}}.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleServiceTests {
  // system under test
  IExampleService sut = null;
  @BeforeEach
  public void setup(){
    sut = new ExampleService();
  }

  @Test
  // what Arrange, Act, Assert
  // https://robertmarshall.dev/blog/arrange-act-and-assert-pattern-the-three-as-of-unit-testing/
  public void add(){
    // arrange
    var a = 1;
    var b = 2;
    var expected = 3;
    // act 
    var result = sut.Add(a, b);
    // assert
    assertEquals(expected, result.getResult());
  }
}