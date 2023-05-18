package com.swlo;

import com.swlo.client.Client;
import com.swlo.vehicle.Car;

import java.util.ArrayList;

public class Locadora {

    private static final String name = "Toca das Acuaminas";

    private static final String address = "Jungle";

    private static final String phone = "70 7070-7070";

    private static ArrayList<Car> available;
    private static ArrayList<Car> loaned;
    private static ArrayList<Client> clients;
    private static ArrayList<Loan> loans;


    public static String getName() {
        return name;
    }

    public static String getAddress() {
        return address;
    }

    public static String getPhone() {
        return phone;
    }

    public static ArrayList<Car> getAvailableList() {
        return available;
    }

    public static ArrayList<Car> getLoanedList() {
        return loaned;
    }

    public static ArrayList<Client> getClientsList() {
        return clients;
    }

    public static ArrayList<Loan> getLoansList() {
        return loans;
    }

    public static void addLoaned(Car car) {
        loaned.add(car);
        available.remove(car);
    }

    public static void removeLoaned(Car car){
        available.add(car);
        loaned.remove(car);

    }
}


