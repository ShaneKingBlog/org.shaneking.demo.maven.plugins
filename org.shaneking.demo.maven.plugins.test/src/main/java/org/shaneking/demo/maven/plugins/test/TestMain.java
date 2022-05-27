package org.shaneking.demo.maven.plugins.test;

import java.util.Arrays;

public class TestMain {
  public static void main(String[] args) {
    System.out.println("org.shaneking.demo.maven.plugins.test.TestMain.main:begin!");
    Arrays.stream(args).forEach(s -> System.out.println(s));
    System.out.println("org.shaneking.demo.maven.plugins.test.TestMain.main:end!");
  }
}
