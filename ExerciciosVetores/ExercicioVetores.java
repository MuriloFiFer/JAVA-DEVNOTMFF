package ExerciciosVetores;


public class  ExercicioVetores {
    public void Exercicio1(){
        int vetorA[]= new int[]{5,10,15,20,25}; /*5 valores no vetorA */
        int vetorB[]= new int[5]; /* colocando um vetor de 5 valores */
        vetorB[0]=vetorA[0];  /* indicando o valor da primeira posição do vetorB como o valor da primeira posição do vetorA */
        vetorB[1]=vetorA[1]; /* indicando o valor da segunda posição do vetorB como o valor da segunda posição do vetorA */
        vetorB[2]=vetorA[2];
        vetorB[3]=vetorA[3];
        vetorB[4]=vetorA[4];
        System.out.println("O vetorB é");  /* imprimindo os valores do vetorB */
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);

    }

    public void Exercicio2(){
        int vetorA[]=new int[]{2,4,6,8,10,12,14,16};
        int vetorB[]=new int[8];
        vetorB[0]=vetorA[0]*2;
        vetorB[1]=vetorA[1]*2;
        vetorB[2]=vetorA[2]*2;
        vetorB[3]=vetorA[3]*2;
        vetorB[4]=vetorA[4]*2;
        vetorB[5]=vetorA[5]*2;
        vetorB[6]=vetorA[6]*2;
        vetorB[7]=vetorA[7]*2;
        System.out.println("O vetorB é"); 
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]); 
}

    public void Exercicio3(){
        int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[]=new int[]{vetorA[0]*vetorA[0],vetorA[1]*vetorA[1],vetorA[2]*vetorA[2],vetorA[3]*vetorA[3],vetorA[4]*vetorA[4],vetorA[5]*vetorA[5],vetorA[6]*vetorA[6],
         vetorA[7]*vetorA[7],vetorA[8]*vetorA[8],vetorA[9]*vetorA[9],vetorA[10]*vetorA[10],vetorA[11]*vetorA[11],vetorA[12]*vetorA[12],vetorA[13]*vetorA[13],vetorA[14]*vetorA[14]};
         System.out.println("O vetorB é"); 
         System.out.println(vetorB[0]);
         System.out.println(vetorB[1]);
         System.out.println(vetorB[2]);
         System.out.println(vetorB[3]);
         System.out.println(vetorB[4]);
         System.out.println(vetorB[5]);
         System.out.println(vetorB[6]);
         System.out.println(vetorB[7]);
         System.out.println(vetorB[8]);
         System.out.println(vetorB[9]);
         System.out.println(vetorB[10]);
         System.out.println(vetorB[11]);
         System.out.println(vetorB[12]);
         System.out.println(vetorB[13]);
         System.out.println(vetorB[14]);
}
public void Exercicio4(){
    int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; /* Math.sqrt  */
    double vetorB[]=new double[]{Math.sqrt(vetorA[0]),Math.sqrt(vetorA[1]),Math.sqrt(vetorA[2]),Math.sqrt(vetorA[3]),Math.sqrt(vetorA[4]),Math.sqrt(vetorA[5]),Math.sqrt(vetorA[6]),
        Math.sqrt(vetorA[7]),Math.sqrt(vetorA[8]),Math.sqrt(vetorA[9]),Math.sqrt(vetorA[10]),Math.sqrt(vetorA[11]),Math.sqrt(vetorA[12]),Math.sqrt(vetorA[13]),Math.sqrt(vetorA[14])};
        System.out.println("O vetorB é"); 
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        System.out.println(vetorB[8]);
        System.out.println(vetorB[9]);
        System.out.println(vetorB[10]);
        System.out.println(vetorB[11]);
        System.out.println(vetorB[12]);
        System.out.println(vetorB[13]);
        System.out.println(vetorB[14]);
}
public void Exercicio5(){
    int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorB[]=new int[]{vetorA[0]*1,vetorA[1]*2,vetorA[2]*3,vetorA[3]*4,vetorA[4]*5,vetorA[5]*6,vetorA[6]*7,vetorA[7]*8,vetorA[8]*9,vetorA[9]*10};
    System.out.println("O vetorB é:"); 
    System.out.println(vetorB[0]);
    System.out.println(vetorB[1]);
    System.out.println(vetorB[2]);
    System.out.println(vetorB[3]);
    System.out.println(vetorB[4]);
    System.out.println(vetorB[5]);
    System.out.println(vetorB[6]);
    System.out.println(vetorB[7]);
    System.out.println(vetorB[8]);
    System.out.println(vetorB[9]);
}
public void Exercicio6(){
    int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorB[]=new int[]{1,2,3,4,5,6,7,8,9,10};
    int vetorc[]=new int[]{vetorA[0]+vetorB[0],vetorA[1]+vetorB[1],vetorA[2]+vetorB[2],vetorA[3]+vetorB[3],vetorA[4]+vetorB[4],
        vetorA[5]+vetorB[5],vetorA[6]+vetorB[6],vetorA[7]+vetorB[7],vetorA[8]+vetorB[8],vetorA[9]+vetorB[9],};
        System.out.println("O VetorC é:");
        System.out.println(vetorc[0]);
        System.out.println(vetorc[1]);
        System.out.println(vetorc[2]);
        System.out.println(vetorc[3]);
        System.out.println(vetorc[4]);
        System.out.println(vetorc[5]);
        System.out.println(vetorc[6]);
        System.out.println(vetorc[7]);
        System.out.println(vetorc[8]);
        System.out.println(vetorc[9]);
}
}

