import java.util.Stack;

public class Stack {

    public static void main(String arg[]) {

            String cadenano = "(Cadena no equilibrada en paréntesis(()()()))))";

            String cadenasi = "(Cadena equilibrada en parentesis())";

            System.out.println("Verificación equilibrado en paréntesis para cadenano:");

            System.out.println(verificaParentesis(cadenano));

            System.out.println("Verificación equilibrado en paréntesis para cadenasi:");

            System.out.println(verificaParentesis(cadenasi));

    }

 

    public static boolean verificaParentesis(String cadena)  {

        Stack<String> pila = new Stack<String>();       int i = 0;

            while (i<cadena.length()) {  // Recorremos la expresión carácter a carácter

                if(cadena.charAt(i)=='(') {pila.push("(");} // Si el paréntesis es de apertura apilamos siempre                               

                else if  (cadena.charAt(i)==')') {  // Si el paréntesis es de cierre actuamos según el caso

                            if (!pila.empty()){ pila.pop(); } // Si la pila no está vacía desapilamos

                            else { pila.push(")"); break; } // La pila no puede empezar con un cierre, apilamos y salimos

                }

                i++;

            }

            if(pila.empty()){ return true; } else { return false; }

    }

}

// Algoritmo sacado de: https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=608:la-estructura-de-datos-pila-en-java-clase-stack-del-api-java-ejemplo-simple-y-ejercicios-resueltos-cu00923c&catid=58&Itemid=180
