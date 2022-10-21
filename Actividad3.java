public class Actividad3 {
    public static void main(String[] args) {
        //Variables//
        //Punto 1
        String saludo ="Hola";
        //Punto 2,3,4
        String nombre ="Juan";
        int edad = "32";
        //Punto 5
        String data1 = "Primero";
        String data2 = "Segundo";
        String data3 = "Tercero";
        //Punto 6
        float valor= 0.67f;
        int valor1 = 2;
        int valor2 = 3;
        float result;

        result=(float)2/3;
        


        //Resultado Punto 1
        System.out.printf("%s \n",saludo);
        //Resultado Punto 2
        System.out.printf("Hola me llamo %s \n",nombre);
        //Resultado Punto 3
        System.out.printf("Hola me llamo %s y tengo %d años \n",nombre,edad);
        //Resultado Punto 4
        System.out.printf("Nombre: %s \n Edad: %s\n",nombre,edad);
        //Resultado Punto 5
        System.out.printf("\"%s\\%s\\%s\"",data1,data2,data3);
        //Resultado Punto 6
        System.out.printf("2\\3 =\" \t %.2f\" \n",valor);
        //Otra forma Punto 6
        System.out.printf("%d\\%d =\" \t %.2f\"\n",valor1,valor2,result);
    }
    
}
