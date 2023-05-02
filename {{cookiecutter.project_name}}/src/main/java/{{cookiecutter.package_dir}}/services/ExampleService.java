package {{cookiecutter.package}}.services;

public class ExampleService implements IExampleService {
  /**
   * This method is used to add two integers.
   * example: a + b = c
   * @param a first parameter to add
   * @param b second parameter to add
   * @return sum of a + b
   */

  public ExampleResultDto Add(Float a, Float b){
    return new ExampleResultDto(a + b);
  }
}