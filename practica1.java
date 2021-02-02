import java.util.InputMismatchException;
import java.util.Scanner;

public class practica1 {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //Indica si salimos o no
        boolean salir = false;
        int opcion;
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while (!salir) {
            //opciones
            System.out.println(("\n")+"1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Opcion 5");
            System.out.println("6. Opcion 6");
            System.out.println("7. Opcion 7");
            System.out.println("8. Opcion 8");
            System.out.println("9. Opcion 9");
            System.out.println("10. Salir");
		  	try{
                //Pide una opcion
                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();
                //Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        //System.out.println("Esta es la opcion 1");
                    	AlmacenarNumeros(args);
                        break;
                    case 2:
                        //System.out.println("Esta es la opcion 2");
                    	AlmacenarNumerosInversos(args);
                    	break;
                    case 3:
                        //System.out.println("Esta es la opcion 3");
                        NumerosPositivosNegativosCeros(args);
                        break;
                    case 4:
                        //System.out.println("Esta es la opcion 4");
                        ContarCaracteresString(args);
                        break;
                    case 5:
                        //System.out.println("Esta es la opcion 5");
                    	TextoInvertido(args);
                    	break;
                    case 6:
                        //System.out.println("Esta es la opcion 6");
                    	QuitarEspacioBlanco(args);
                        break;
                    case 7:
                        //System.out.println("Esta es la opcion 6");
                    	ConcatenarCadenas(args);
                    	break;
                    case 8:
                        //System.out.println("Esta es la opcion 6");
                    	ContarVocales(args);
                    	break;
                    case 9:
                        //System.out.println("Esta es la opcion 6");
                    	CadenaASCII(args);
                    	break;
                    case 10:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 10");
                }
                //controla la excepcion en caso de que se introduzca un valor no correcto
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }
        }
 }
	public static void AlmacenarNumeros(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[];
        num = new int[5];
        for (int i=0;i<5;i++)
        {
        	System.out.print("Introduzca un número: ");
        	num[i]=in.nextInt();
        }
        System.out.println("Los números son:");
        for (int i=0;i<5;i++)
        	System.out.print((num[i])+" ");  
	}
	public static void AlmacenarNumerosInversos(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
		int num[];
        num = new int[5];
        for (int i=0;i<5;i++)
        {
        	System.out.print("Introduzca un número: ");
        	num[i]=in.nextInt();
        }
        System.out.println("Los números son:");
        for (int i=num.length -1;i >=0;i--)
            System.out.println("Indice  " + i + " =" + num[i]);  
		}finally {in.close();}
	}
	public static void NumerosPositivosNegativosCeros(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[]=new int [5];
		int suma_pos,cont_pos,suma_neg,cont_neg,cont_cero;
		suma_pos=0;
		cont_pos=0;
		suma_neg=0;
		cont_neg=0;
		cont_cero=0;
		// Utilizamos un bucle para leer los datos y otro para procesarlos
		for (int i=0;i<5;i++){
			System.out.print("Introduzca un número: ");
			num[i]=in.nextInt();
		}
		for (int i=0;i<5;i++){
			if(num[i]==0)
				cont_cero++;
			else{
				if(num[i]>0){
					suma_pos=suma_pos+num[i];
					cont_pos++;
				}
				else{
					suma_neg=suma_neg+num[i];
					cont_neg++;
				}
			}
		}
		if(cont_pos==0)
			System.out.println("No se puede realizar la media de números positivos");
		else
			System.out.println("La media de los positivos: "+(float)suma_pos/cont_pos);
		if(cont_neg==0)
			System.out.println("No se puede realizar la media de números negativos");
		else{
			System.out.println("La media de los negativos es: "+suma_neg/cont_neg);
		}
		if(cont_cero==0){
			System.out.println("No se pudo calcular la cantidad de ceros");}
		else{
			System.out.println("La cantidad de ceros es de: "+cont_cero);
		}
	}
	public static void ContarCaracteresString(String[] args){
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Escribe lo qué quieras.");
		text = in.nextLine();
		int length = text.length();
		System.out.println("En total has escritro " + text.length()+" carácteres." );
	}
	public static void TextoInvertido(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Escribe lo qué quieras y te lo devolveré invertido.");
		text = in.nextLine();
		StringBuilder text2 = new StringBuilder(text);
		text = text2.reverse().toString();
		System.out.println(text);
	}
	public static void QuitarEspacioBlanco(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Escribe lo qué quieras.");
		text = in.nextLine();
		System.out.println(text.replace(" ",""));
	}
	public static void ConcatenarCadenas(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Escribe un texto.");
		text = in.nextLine();
		String text2;
		System.out.println("Escribe otro texto.");
		text2 = in.nextLine();
		System.out.println(text+" "+text2);
	}
	public static void ContarVocales(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Escribe un texto.");
		text = in.nextLine();
		String vocal;
		System.out.println("Elige una vocal");
		vocal = in.nextLine();
		String vocales ="[aAeEiIoOuU]";
		System.out.println(text.replaceAll(vocales, vocal));
	}
	public static void CadenaASCII(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Escribe un texto.");
		text = in.nextLine();
		for (int i=0; i<text.length(); i++) {
			char character = text.charAt(i);
			int codeASCII = (int) character;
			System.out.println(codeASCII);
		}
	}
}