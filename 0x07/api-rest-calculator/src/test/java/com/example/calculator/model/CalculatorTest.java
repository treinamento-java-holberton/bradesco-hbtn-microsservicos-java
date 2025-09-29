package com.example.calculator.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        assertThat(calculator.sum(1D, 2D)).isEqualTo(3D);
    }

    @Test
    public void numbersNullSumTest() {
        assertThatThrownBy(() -> calculator.sum(null, null)).isInstanceOf(NullPointerException.class);
    }

    @Test
    void subTest() {
        assertThat(calculator.sub(2D, 1D)).isEqualTo(1D);
    }

    @Test
    void divideTest() {
        assertThat(calculator.divide(2D, 2D)).isEqualTo(1D);
    }

    @Test
    public void divisionByZeroTest() {
        assertThatThrownBy(() -> calculator.divide(2D, 0D)).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void factorialTest() {
        // TODO
    }

    @Test
    void integerToBinaryTest() {
        assertThat(calculator.factorial(3)).isEqualTo(6);
    }

    @Test
    void integerToHexadecimalTest() {
        assertThat(calculator.integerToHexadecimal(10)).isEqualTo("a");
        assertThat(calculator.integerToHexadecimal(9)).isEqualTo("9");
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate data1 = LocalDate.of(2025, 9, 5);
        LocalDate data2 = LocalDate.of(2025, 9, 10);

        assertThat(calculator.calculeDayBetweenDate(data1, data2)).isEqualTo(5);
    }
}