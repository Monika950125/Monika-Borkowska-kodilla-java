package com.kodilla.testing.shape;


 class Square implements Shape{

     private double sideA;

     public String getShapeName(){
        return "Square";
    }

    public double getField(){
        double area = Math.sqrt(sideA);
        return area;
     }

     public double getSideA() {
         return sideA;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Square square = (Square) o;

         return Double.compare(square.sideA, sideA) == 0;
     }

     @Override
     public int hashCode() {
         long temp = Double.doubleToLongBits(sideA);
         return (int) (temp ^ (temp >>> 32));
     }
 }
