import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class FitnessClubWFCTest {
    @Test
    public void testWatchtheTimetble() {
        String expectedOutput = "Choose how you want to see the timetable:\n1. By day\n2. By lesson\nInvalid option!\n";
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        FitnessClubWFC.watchtheTimetble();
        assertEquals(expectedOutput, System.out.toString());
    }

    @Test
    public void testMakeBooking() {
        String expectedOutput = "Choose a day (1 for Saturday, 2 for Sunday):\nInvalid day!\n";
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        FitnessClubWFC.makeBooking();
        assertEquals(expectedOutput, System.out.toString());
    }

    @Test
    public void testCancelBooking() {
        String expectedOutput = "Choose a day (1 for Saturday, 2 for Sunday):\nInvalid day!\n";
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        FitnessClubWFC.cancelBooking();
        assertEquals(expectedOutput, System.out.toString());
    }

    @Test
    public void testWriteReview() {
        String expectedOutput = "Choose a lesson:\nInvalid lesson!\n";
        String input = "7";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        FitnessClubWFC.writeReview();
        assertEquals(expectedOutput, System.out.toString());
    }

    @Test
    public void testGenerateReport() {
        String expectedOutput = "Choose how you want to generate the report:\n1. Average ratings per lesson\n2. Highest income class\n3. Number of customers per lesson\nInvalid option!\n";
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        FitnessClubWFC.generateReport();
        assertEquals(expectedOutput, System.out.toString());
    }
}
