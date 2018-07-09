package com.iqlab.calculator;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CalculatorComponent {
    @ShellMethod("Add two integers together.")
    int add(int augend, int addend) {
        return augend + addend;
    }
}
