
package com.springboot.exercise.domain;

import java.util.ArrayList;

public class Matrix {
    
    private ArrayList<Integer> Domain;
    private int matrix[][];
    private final int R;
    private final int C;
    private final int Z;
    
    public Matrix(int R, int C, int Z){
        this.matrix = new int[R][C];
        this.Domain = new ArrayList();
        this.R = R;
        this.C = C;
        this.Z = Z;
    }

    public int getR() {
        return this.R;
    }

    public int getC() {
        return this.C;
    }

    public int getZ() {
        return this.Z;
    }

    public void fillDomain(){
        for( int i = this.Z ; i <= ( this.R + this.Z ) - 1 ; i++ ){
            this.Domain.add(i);
        }
    }

    public String fillMatrix(){
        this.fillDomain();
        String Print = ("<h1>matriz :</h1>");
        for( int i = 0 ; i < this.R ; i ++){
            for( int j = 0 ; j < this.C ; j++){
                this.matrix[i][j] = this.Domain.get(i); 
                Print = Print.concat(this.matrix[i][j] + "\n");
            }
            Print = Print.concat("<br>");
        }
        return Print;
    }
    
    public String getSum(int X, int Y){
        int sum = 0;
        String Print = ("<h3>Los numeros de la suma son : </h3><br>");
        for( int i = 0 ; i <= Y ; i ++){
            for( int j = 0 ; j <= X ; j++){
                Print = Print.concat(this.matrix[i][j]+ "\n");
                sum = sum + this.matrix[i][j];
            }
            Print = Print.concat("<br>");
        }
        Print = Print.concat("<br>El resultado de la suma es: " + sum );
        return Print;
    }
}
