/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author JEDiver
 */
public class Main {

    public static void main(String[] args) {
        WeatherStatus weatherStatus = new WeatherStatus(null, null, new Display3(), new Display4());
        weatherStatus.setTemperature(12.5f);
        weatherStatus.setPressure(11.5f);
        weatherStatus.setHumidity(22.4f);
        weatherStatus.weatherChanged();
    }
}
