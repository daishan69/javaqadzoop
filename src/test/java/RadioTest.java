import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void setCurrentStation_ValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);
    }
    @Test
    public void setCurrentStation_InvalidStationMinus() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_InvalidStationPlus() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStationTo0() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStationTo1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStationTo8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStationTo9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals( expected, actual);
    }
    @Test
    public void nextStation_CurrentStationIs9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void nextStation_CurrentStationIs0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void nextStation_CurrentStationIs1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void nextStation_CurrentStationIs8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void prevStation_CurrentStationIs0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void prevStation_CurrentStationIs1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void prevStation_CurrentStationIs9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void prevStation_CurrentStationIs8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void setVolume_ValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void setVolume_InvalidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void increaseVolume_VolumeIs0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void increaseVolume_VolumeIsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void increaseVolume_VolumeIs50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void decreaseVolume_VolumeIs0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }

    @Test
    public void decreaseVolume_VolumeIs100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void decreaseVolume_VolumeIs50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
}
