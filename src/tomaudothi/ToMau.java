/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomaudothi;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Thuan
 */
public class ToMau {
    Graph G = new Graph();

    public ToMau(Graph G) {
        this.G = G;
    }

    public ToMau() {
    }
    
    int toduoc(Graph G, int v[], int u, int color){ //v[] ds mau, dinh u, mau color
        int i;
        for(i = 1; i <= G.getN(); i++){
            if((G.A[u][i] == 1) && (v[i] == color))
                   return 0;
        }
        return 1;
    }
    
    int to1mau(Graph G,int v[], int color){ 
        int i, count = 0;
        for(i = 1; i <= G.getN(); i++){
            if(v[i] == 0 && toduoc(G,v, i, color) == 1){
                v[i] = color;
                count++;
            }
        }
        return count;
    }
    
    int tomau(Graph G,int v[]){
        int i, count = 0, somau = 0;
        for(i = 1; i <= G.getN(); i++)
               v[i] = 0;
        
        while(count < G.getN()){
            somau++;
            count += to1mau(G,v, somau);
        }
        return somau;
    }    
    public String run(Graph G, int n) {
        G.in(G);
        int y,somau1 = 0;
        int v1[] = new int[G.getN()+1];
        somau1 = tomau(G,v1);
        String string = "So mau can dung: " + somau1 + "\n";
        for(y = 1; y <= G.getN(); y++){
            string+=("Dinh " + y + " -> mau " + v1[y] + "\n");
        }
        return string;
    }
    
    public String run(Graph G,File tenFile) throws FileNotFoundException {
        G.nhap(tenFile);
        System.out.println(G.in(G));
        int y,somau1 = 0;
        int v1[] = new int[G.getN()+1];
        somau1 = tomau(G,v1);
        String string = "So mau can dung: " + somau1 + "\n";
        for(y = 1; y <= G.getN(); y++){
            string+=("Dinh " + y + " -> mau " + v1[y] + "\n");
        }
        return string;
    }
    
    public String run(Graph G,int n, int m) {
        G = G.ngauNhien(G, n, m);
        System.out.println(G.in(G));
        int y,somau1 = 0;
        int v1[] = new int[G.getN()+1];
        somau1 = tomau(G,v1);
        String string = "So mau can dung: " + somau1 + "\n";
        for(y = 1; y <= G.getN(); y++){
            string+=("Dinh " + y + " -> mau " + v1[y] + "\n");
        }
        return string;
    }
    
    public int degree(Graph G, int u){
        int i, deg = 0;
        for(i = 0; i <= G.getN(); i++)
            deg += G.A[i][u];
        return deg;
    }
    
    void bubbleSort(int A[], int n, int dinh[]){
        int i,j;
        for(i = 1; i<= n; i++){
            for(j = i+1; j<= n; j++){
                if(A[i] < A[j]){
                    int t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                    
                    int u = dinh[i];
                    dinh[i] = dinh[j];
                    dinh[j] = u;
                }
            }
        }
    }
    
    void sortDeg(Graph G, int deg[], int dinh[]){
        int i;
        for(i = 1; i <= G.getN(); i++){
            deg[i] = degree(G, i);
            dinh[i] = i;
        }
        
        bubbleSort(deg, G.getN(), dinh);
        //for(i = 1; i<=)
    }
    int to1mau(Graph G,int v[], int color, int dinh[]){
        int i, count = 0;
        for(i = 1; i <= G.getN(); i++){
            if(v[dinh[i]] == 0 && toduoc(G,v, dinh[i], color) == 1){
                v[dinh[i]] = color;
                count++;
            }
        }
        return count;
    }
    
    int tomau(Graph G,int v[], int dinh[]){
        int i, count = 0, somau = 0;
        for(i = 1; i <= G.getN(); i++)
               v[i] = 0;
        
        while(count < G.getN()){
            somau++;
            count += to1mau(G,v, somau,dinh);
        }
        return somau;
    }
    public String run_wp(Graph G,File tenFile) throws FileNotFoundException {
        
        G.nhap(tenFile);
        System.out.println(G.in(G));
        int y,somau1 = 0;
        int v1[] = new int[G.getN()+1];
        int dinh[] = new int[G.getN()+1];
        int deg[] = new int[G.getN()+1];
        sortDeg(G, deg, dinh);
         somau1 = tomau(G,v1,dinh);
        String string = "So mau can dung: " + somau1 + "\n";
        for(y = 1; y <= G.getN(); y++){
            string+=("Dinh " + dinh[y] + " -> mau " + v1[dinh[y]] + "\n");
        }
        return string;
    }    
    public String run_wp(Graph G,int n, int m) throws FileNotFoundException {
        System.out.println(G.in(G));
        int y,somau1 = 0;
        int v1[] = new int[G.getN()+1];
        int dinh[] = new int[G.getN()+1];
        int deg[] = new int[G.getN()+1];
        sortDeg(G, deg, dinh);
         somau1 = tomau(G,v1,dinh);
        String string = "So mau can dung: " + somau1 + "\n";
        for(y = 1; y <= G.getN(); y++){
            string+=("Dinh " + dinh[y] + " -> mau " + v1[dinh[y]] + "\n");
        }
        return string;
    }
        
    public String run_wp(Graph G, int n) throws FileNotFoundException {
        G.in(G);
        int y,somau1 = 0;
        int v1[] = new int[G.getN()+1];
        int dinh[] = new int[G.getN()+1];
        int deg[] = new int[G.getN()+1];
        sortDeg(G, deg, dinh);
         somau1 = tomau(G,v1,dinh);
        String string = "So mau can dung: " + somau1 + "\n";
        for(y = 1; y <= G.getN(); y++){
            string+=("Dinh " + dinh[y] + " -> mau " + v1[dinh[y]] + "\n");
        }
        return string;
    }
}
