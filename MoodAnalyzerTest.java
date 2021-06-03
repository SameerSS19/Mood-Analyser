package com.moodanalyser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyzerTest {

	@Test
    public void givenSadMessage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in sad mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenHappyMassage(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am in happy mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenAnyMassage() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Hello am not in mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
