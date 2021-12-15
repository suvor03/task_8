package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;

public class TestProgram {
    RotateMatrix rotate = new RotateMatrix();

    @Test
    public void test1() {
        int[][] testMatrix = ArrayUtils.readIntArray2FromFile("tests/input1.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("tests/output1.txt");
        int[][] realMeaning = rotate.rotateMatrixOnNinetyDegrees(testMatrix);

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void test2() {
        int[][] testMatrix = ArrayUtils.readIntArray2FromFile("tests/input2.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("tests/output2.txt");
        int[][] realMeaning = rotate.rotateMatrixOnNinetyDegrees(testMatrix);

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void test3() {
        int[][] testMatrix = ArrayUtils.readIntArray2FromFile("tests/input3.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("tests/output3.txt");
        int[][] realMeaning = rotate.rotateMatrixOnNinetyDegrees(testMatrix);

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void test4() {
        int[][] testMatrix = ArrayUtils.readIntArray2FromFile("tests/input4.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("tests/output4.txt");
        int[][] realMeaning = rotate.rotateMatrixOnNinetyDegrees(testMatrix);

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void test5() {
        int[][] testMatrix = ArrayUtils.readIntArray2FromFile("tests/input5.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("tests/output5.txt");
        int[][] realMeaning = rotate.rotateMatrixOnNinetyDegrees(testMatrix);

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }
}