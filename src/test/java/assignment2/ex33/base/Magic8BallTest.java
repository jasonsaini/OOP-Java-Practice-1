/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package assignment2.ex33.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {
    @Test
    void random_index_in_range_set1()
    {
        Magic8Ball ball = new Magic8Ball();
        int rand = ball.generateRandIndex();
        assertTrue(rand <= 3 && rand >= 0);
    }

    @Test
    void random_index_in_range_set2()
    {
        Magic8Ball ball = new Magic8Ball();
        int rand = ball.generateRandIndex();
        assertTrue(rand <= 3 && rand >= 0);
    }

    @Test
    void random_index_in_range_set3()
    {
        Magic8Ball ball = new Magic8Ball();
        int rand = ball.generateRandIndex();
        assertTrue(rand <= 3 && rand >= 0);
    }

    @Test
    void random_index_in_range_set4()
    {
        Magic8Ball ball = new Magic8Ball();
        int rand = ball.generateRandIndex();
        assertTrue(rand <= 3 && rand >= 0);
    }

    @Test
    void random_index_in_range_set5()
    {
        Magic8Ball ball = new Magic8Ball();
        int rand = ball.generateRandIndex();
        assertTrue(rand <= 3 && rand >= 0);
    }

}