package edu.westga.comp4420.junit_sample.test.model.telephone_checker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.comp4420.junit_sample.model.TelephoneChecker;

class TestIdentifySpam {
	@ParameterizedTest
    @CsvSource({"9998810810, true", "4042384156, false", "9008934892, true", "6784416543, false",
	"8882888491, true", "7065707890, false", "8005651551, true", "7706415424, false",
	"9116543210, true", "478662609, false", "4117890123, true", "24781225694, false"})
    void testIdentifySpam(long number, boolean expectedResult) {
        TelephoneChecker checker = new TelephoneChecker();
        boolean result = checker.identifySpam(number);
        assertEquals(expectedResult, result, "Checking if number(" + number + ") is flagged as spam");
    }
}
