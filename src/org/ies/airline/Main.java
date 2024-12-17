package org.ies.airline;

import org.ies.airline.components.AirlineReader;
import org.ies.airline.components.FlightReader;
import org.ies.airline.components.PassengerReader;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    PassengerReader passengerReader = new PassengerReader(scanner);
    FlightReader flightReader = new FlightReader(scanner, passengerReader);
    AirlineReader airlineReader = new AirlineReader(scanner, flightReader);


}