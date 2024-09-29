package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        ft.setActualFuel(-8);
        System.out.println("Actualizando capacidad con un valor válido");
        ft.setActualFuel(15);  // Usamos el setter con un valor positivo
        ft.showDetails();

    }
}