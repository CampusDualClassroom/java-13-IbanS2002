package com.campusdual.classroom;

public class FuelTank {

  // Cambiamos la visibilidad de actualFuel a private para encapsular la propiedad.
  private int actualFuel = 10;

  // Getter para obtener el valor de actualFuel.
  public int getActualFuel() {
    return this.actualFuel;
  }

  // Setter para modificar el valor de actualFuel con validación.
  public void setActualFuel(int actualFuel) {
    // Verificamos que el valor no sea negativo.
    if (actualFuel >= 0) {
      this.actualFuel = actualFuel;
    } else {
      // Mensaje informativo si se intenta asignar un valor negativo.
      System.out.println("El valor del combustible no puede ser negativo.");
    }
  }

  // Método showDetails que utiliza el getter para obtener el valor de actualFuel.
  public void showDetails() {
    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
  }
}
