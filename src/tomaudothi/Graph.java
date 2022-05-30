/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomaudothi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thuan
 */
public class Graph {
    private int n,m;
    public int A[][];
    
    public Graph() {
        this.n = 0;
        this.m = 0;
    }

    public Graph(int n1, int m1, int[][] A1) {
        this.n = n1;
        this.m = m1;
        this.A = A1;
    }

    public void init_graph(Graph G, int n1){
        G.n = n1;
        G.m = 0;
        int i,j;
        G.A = new int[n1+1][n1+1];
        for(i = 1; i <= n1; i++){
            for(j = 1; j <= n1; j++){
                G.A[i][j] = 0;
            }  
        }
    }
    
    public void add_edge(Graph G, int u, int v){
        G.m++;
        G.A[u][v] = 1;
        G.A[v][u] = 1;
    }
    
    public boolean check_Edge(Graph G, int u, int v){
        if(G.A[u][v] == 1)
            return true;
        return false;
    }
    
    public void nhap(File file) throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        
        int n1,m1;
        n1 = Integer.parseInt(sc.next()) ;
        init_graph(this, n1);
        m1 = Integer.parseInt(sc.next());
        int i,u,v,j;
        for(i = 1; i <= n1; i++){
            for(j = 1; j <= n1; j++){
                u = Integer.parseInt(sc.next());
                if(u == 1){
                    this.A[i][j] = u;  
                    this.m++;                    
                }
            }
        }
        this.m = this.m/2;
    }
        
    public void nhap(int n, int m) throws FileNotFoundException{
        this.init_graph(this, n);
        this.m = m;
        Scanner sc = new Scanner(System.in);
        
        int i,u,v;
        for(i = 1; i <= m; i++){
            u = Integer.parseInt(sc.next());
            v = Integer.parseInt(sc.next());
            add_edge(this, u, v);
        }    
    }
    public String in(Graph G){
        String str = "";
        int i,j;
        for(i = 1; i <= G.n; i++){
            for(j = 1; j <= G.n; j++){
                str+=(G.A[i][j] + " ");
            }
            str+=("\n");
        }
        return str;
    }
    
    public Graph ngauNhien (Graph G, int n, int m){
        int count = 0;
        init_graph(G, n);
        Random rand = new Random();
        while(count < m){
            int ranNum1 = rand.nextInt(n)+1;
            int ranNum2 = rand.nextInt(n)+1;
            
            if((ranNum1 != ranNum2) && !check_Edge(G, ranNum1, ranNum2)){
                add_edge(G, ranNum1, ranNum2);
                count++;
            }  
        }
        return G;
    }
    


    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int[][] getA() {
        return A;
    }
    
}
