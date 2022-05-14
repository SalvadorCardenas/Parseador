package sample.views;
public class Traductor {
    String traducir(String sor){   // OBTIENE EL TEXTO A TARDUCIR
        String txt="";
        int numLetras;              // INICIAR CONTADOR DE LETRAS
        sor= sor.toUpperCase();
        for(numLetras=0;numLetras<sor.length();numLetras++){         //MIENTRAS QUE EL CONTADOR SEA MENOR AL NUMERO DE LETRAS
            switch (sor.charAt(numLetras)){   // VA A EVALUAR LA LETRA NUM. N DE LA PALABRA
                case '0': txt=txt+"-----";
                    break;
                case '1': txt=txt+".----";
                    break;
                case '2': txt=txt+"..---";
                    break;
                case '3': txt=txt+"...--";
                    break;
                case '4': txt=txt+"....-";
                    break;
                case '5': txt=txt+".....";
                    break;
                case '6': txt=txt+"-....";
                    break;
                case '7': txt=txt+"--...";
                    break;
                case '8': txt=txt+"---..";
                    break;
                case '9': txt=txt+"----.";
                    break;
                case 'A': txt=txt+".-";
                    break;
                case 'B': txt=txt+"-...";
                    break;
                case 'C': txt=txt+".-";
                    break;
                case 'D': txt=txt+"-..";
                    break;
                case 'E': txt=txt+".";
                    break;
                case 'F': txt=txt+"..-.";
                    break;
                case 'G': txt=txt+"--.";
                    break;
                case 'H': txt=txt+"....";
                    break;
                case 'I': txt=txt+"..";
                    break;
                case 'J': txt=txt+".---";
                    break;
                case 'K': txt=txt+"-.-";
                    break;
                case 'L': txt=txt+".-..";
                    break;
                case 'M': txt=txt+"--";
                    break;
                case 'N': txt=txt+"-.";
                    break;
                case 'Ñ': txt=txt+"--.--";
                    break;
                case 'O': txt=txt+"---";
                    break;
                case 'P': txt=txt+".--.";
                    break;
                case 'Q': txt=txt+"--.-";
                    break;
                case 'R': txt=txt+".-.";
                    break;
                case 'S': txt=txt+"...";
                    break;
                case 'T': txt=txt+"-";
                    break;
                case 'U': txt=txt+"..-";
                    break;
                case 'V': txt=txt+"...-";
                    break;
                case 'W': txt=txt+".--";
                    break;
                case 'X': txt=txt+"-..-";
                    break;
                case 'Y': txt=txt+"-.--";
                    break;
                case 'Z': txt=txt+"--..";
                    break;
                case 'Á': txt=txt+".--.-";
                    break;
                case 'É': txt=txt+"..-..";
                    break;
                case 'Ó': txt=txt+"---.";
                    break;
                case '.': txt=txt+".-.-.-";
                    break;
                case ',': txt=txt+"--..--";
                    break;
                case '?': txt=txt+"..--..";
                    break;
                case '=': txt=txt+"-...-";
                    break;
                case '-': txt=txt+"-....-";
                    break;
                case '"': txt=txt+".---.";
                    break;
                case '/': txt=txt+"-..-.";
                    break;
                case '\'': txt=txt+".---.";
                    break;
                case '!': txt=txt+"-.-.--";
                    break;
                case ':': txt=txt+"---...";
                    break;
                case ';': txt=txt+"-.-.-.";
                    break;
                case '(': txt=txt+"-.--.";
                    break;
                case ')': txt=txt+"-.--.-";
                    break;
                case '_': txt=txt+"..--.-";
                    break;
                case '&': txt=txt+".-...";
                    break;
                case '+': txt=txt+".-.-.";
                    break;
                case '@': txt=txt+".--.-.";
                    break;
                case '¿': txt=txt+"..-.-";
                    break;
                case '¡': txt=txt+"--...-";
                    break;
                case '\n': txt=txt+"\n";   // ESPACIO
                    break;
            }
        }
        return txt;   // REGRESA LA PALABRA EN MORSE
    }
}
