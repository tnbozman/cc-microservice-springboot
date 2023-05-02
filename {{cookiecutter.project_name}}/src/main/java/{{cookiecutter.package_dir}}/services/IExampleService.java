package {{cookiecutter.package}}.services;

import {{cookiecutter.package}}.dtos.ExampleResultDto;

public interface IExampleService {
  /**
   * This method is used to add two integers.
   * example: a + b = c
   * @param a first parameter to add
   * @param b second parameter to add
   * @return sum of a + b
   */

  public ExampleResultDto Add(Integer a, Integer b);
}