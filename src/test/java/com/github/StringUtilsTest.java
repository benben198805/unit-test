package com.github;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @Test
    public void should_return_true_when_input_null_for_isEmpty() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isEmpty(null);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_when_empty_for_isEmpty() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isEmpty("");

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_when_input_null_for_IsBlank() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isBlank(null);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_when_input_empty_for_IsBlank() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isBlank("");

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_when_input_horizontal_tabulation_for_isBlank() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isBlank("\u005Ct");

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_when_input_string_for_IsBlank() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isBlank("string");

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_when_input_empty_for_isAlpha() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isAlpha("");

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_when_input_number_for_isAlpha() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isAlpha("123");

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_when_input_special_characters_for_isAlpha() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isAlpha("^^^^");

        //then
        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_when_input_alpha_for_isAlpha() {
        //given
        StringUtils stringUtils = new StringUtils("string");

        //when
        boolean result = stringUtils.isAlpha("string");

        //then
        assertThat(result).isTrue();
    }

}