
package Ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
     public static void main(String[] args) {   
  Scanner s= new Scanner (System.in);
            String horoscopo = "";
        int mes, dia; 
 
    System.out.print("Introduzca el número del mes en que nació en numeros: ");
     mes=s.nextInt();
    
    System.out.print("Ahora introduzca el día: ");
    dia=s.nextInt();
  
    switch(mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "capricornio";
          System.out.print("Debido a circunstancias fuera de tu control, una tarea a la que has dedicado bastante tiempo podría quedar paralizada hoy. Tu frustración será considerable, ya que no puedes hacer nada para agilizar la situación. No te preocupes demasiado, las cosas volverán a su normalidad. Lo mejor que puedes hacer es trabajar en algo más hasta que el impasse se resuelva. ");
        } else {
          horoscopo = "acuario";
          System.out.print("o hay necesidad de aceptar el estatus quo, especialmente desde que tienes el poder para cambiarlo. Por bastante que te hayas quedado sentado y esperado que otros se hagan cargo. Hoy es el día para que des un paso hacia delante e implementes algunos cambios que se necesitan tan desesperadamente. Para ti hoy es el día de la independencia.");
        }
        break;
      case 2:
        if (dia < 20) {
          horoscopo = "acuario";
          System.out.print("o hay necesidad de aceptar el estatus quo, especialmente desde que tienes el poder para cambiarlo. Por bastante que te hayas quedado sentado y esperado que otros se hagan cargo. Hoy es el día para que des un paso hacia delante e implementes algunos cambios que se necesitan tan desesperadamente. Para ti hoy es el día de la independencia.");
        } else {
          horoscopo = "piscis";
          System.out.print("Hoy es un buen día para pensar en nuevas definiciones y decisiones. En los últimos meses ha habido muchos cambios y no todos han sido fáciles de asumir. Buen momento para echar una mirada renovada y redefinir tus prioridades para luego hacer lo necesario y delegar, combinar, eliminar o bien simplificar. Recuerda qué es lo más importante y que si abarcas demasiado terminarás logrando menos en el largo plazo.");
        }
        break;
      case 3:
        if (dia < 21) {
          horoscopo = "piscis";
          System.out.print("Hoy es un buen día para pensar en nuevas definiciones y decisiones. En los últimos meses ha habido muchos cambios y no todos han sido fáciles de asumir. Buen momento para echar una mirada renovada y redefinir tus prioridades para luego hacer lo necesario y delegar, combinar, eliminar o bien simplificar. Recuerda qué es lo más importante y que si abarcas demasiado terminarás logrando menos en el largo plazo.");
        } else {
          horoscopo = "aries";
          System.out.print("Hoy es un día agradable, lleno de actividades sociales. Pasas buena parte del día con otros, y descubres para tu sorpresa que tienes bastante en común con muchos otros. Es bueno que haya un ambiente tan relajado. Funciona como un buen cambio del ritmo, y ayuda a reafirmar el sentido de hermandad y humanidad. ¡Aprovecha este feliz momento para conocer a los que te rodean! ");
        }
        break;
      case 4:
        if (dia < 21) {
          horoscopo = "aries";
                    System.out.print("Hoy es un día agradable, lleno de actividades sociales. Pasas buena parte del día con otros, y descubres para tu sorpresa que tienes bastante en común con muchos otros. Es bueno que haya un ambiente tan relajado. Funciona como un buen cambio del ritmo, y ayuda a reafirmar el sentido de hermandad y humanidad. ¡Aprovecha este feliz momento para conocer a los que te rodean! ");

          
        } else {
          horoscopo = "tauro";
         System.out.print("Hoy será un día fascinante. Tendrás un visitante del extranjero que te llenará la mente con aventuras de tierras lejanas. Cualquiera que conozcas hoy puede ser interesante, por lo tanto recibe bien a cualquier persona nueva que llegue a tu vida. Se despiertan tu curiosidad y sentido de la aventura. Quizás decidas viajar. Si lo haces, prepárate para el romance; definitivamente las estrellas están contigo.");

        }
        break;
      case 5:
        if (dia < 20) {
          horoscopo = "tauro";
                   System.out.print("Hoy será un día fascinante. Tendrás un visitante del extranjero que te llenará la mente con aventuras de tierras lejanas. Cualquiera que conozcas hoy puede ser interesante, por lo tanto recibe bien a cualquier persona nueva que llegue a tu vida. Se despiertan tu curiosidad y sentido de la aventura. Quizás decidas viajar. Si lo haces, prepárate para el romance; definitivamente las estrellas están contigo.");

        } else {
          horoscopo = "géminis";
          System.out.print("Hoy quizás te encuentres en un espacio donde podrás \"lucirte\" un poquito. Siempre tuviste ese actor nato acechando en tu interior. Muchas personas de tu signo son actores y comediantes exitosos. Quizás tengas algunos chistes para contar o anécdotas interesantes para entretener a tus amistades. No tengas miedo de ser el centro de la atención, deja que los reflectores te iluminen. ¡Tu audiencia se divertirá mucho!");
        }
        break;
      case 6:
        if (dia < 22) {
          horoscopo = "géminis";
                    System.out.print("Hoy quizás te encuentres en un espacio donde podrás \"lucirte\" un poquito. Siempre tuviste ese actor nato acechando en tu interior. Muchas personas de tu signo son actores y comediantes exitosos. Quizás tengas algunos chistes para contar o anécdotas interesantes para entretener a tus amistades. No tengas miedo de ser el centro de la atención, deja que los reflectores te iluminen. ¡Tu audiencia se divertirá mucho!");

        } else {
          horoscopo = "cáncer";
          System.out.print("¿Viajarás en avión hoy, o quizás irás a alguna parte en tren? Si es así, conocerás a alguien fascinante en el viaje. No seas tímida y no dejes que el orgullo o el decoro se interpongan para entablar una conversación con alguien. El tiempo pasará, debes saberlo, y siempre está la posibilidad de que puedan convertirse en grandes amigos. Relájate, sonríe con tu sonrisa más encantadora, y disfruta del viaje.");
        }
        break;
      case 7:
        if (dia < 22) {
          horoscopo = "cáncer";
                    System.out.print("¿Viajarás en avión hoy, o quizás irás a alguna parte en tren? Si es así, conocerás a alguien fascinante en el viaje. No seas tímida y no dejes que el orgullo o el decoro se interpongan para entablar una conversación con alguien. El tiempo pasará, debes saberlo, y siempre está la posibilidad de que puedan convertirse en grandes amigos. Relájate, sonríe con tu sonrisa más encantadora, y disfruta del viaje.");

        } else {
          horoscopo = "Leo";
          System.out.print("¿Qué tal si hoy programamos una relajación especial para ti? Definitivamente está comenzando a notarse el desgaste de tu estresante existencia. ¿Por qué no ir al gimnasio y pasar un tiempo en la sauna o jacuzzi? Piensa en un buen masaje. Tómate esta noche para cenar tranquilamente con ese alguien especial. Ella se sorprenderá al verte tan relajado.");
        }
        break;
      case 8:
        if (dia < 24) {
          horoscopo = "leo";
                    System.out.print("¿Qué tal si hoy programamos una relajación especial para ti? Definitivamente está comenzando a notarse el desgaste de tu estresante existencia. ¿Por qué no ir al gimnasio y pasar un tiempo en la sauna o jacuzzi? Piensa en un buen masaje. Tómate esta noche para cenar tranquilamente con ese alguien especial. Ella se sorprenderá al verte tan relajado.");

        } else {
          horoscopo = "virgo";
          System.out.print("A veces prefieres el perfil bajo. Tiendes a \"ir con la corriente\" y aceptar todo lo que te toca. ¡Así es muy fácil llevarse bien contigo! Pero a veces no logras defender tu posición cuando los demás se aprovechan de ti. Si sientes que te están pidiendo que te ocupes de más de lo que te corresponde, deberías conversarlo con alguien. La situación no desaparecerá si solamente la ignoras.");
        }
        break;
      case 9:
        if (dia < 23) {
          horoscopo = "virgo";
                    System.out.print("A veces prefieres el perfil bajo. Tiendes a \"ir con la corriente\" y aceptar todo lo que te toca. ¡Así es muy fácil llevarse bien contigo! Pero a veces no logras defender tu posición cuando los demás se aprovechan de ti. Si sientes que te están pidiendo que te ocupes de más de lo que te corresponde, deberías conversarlo con alguien. La situación no desaparecerá si solamente la ignoras.");

        } else {
          horoscopo = "libra";
          System.out.print(" Tienes una increíble creatividad, por lo que te resulta doloroso tener que pasarte el día rellenando formularios y removiendo pilas de papeles. Vaya, eso es lo que te espera en el día de hoy. Afortunadamente, además de tu lado creativo, también tienes una gran astucia comercial, lo que te permite acabar con las pilas de papeles en tiempo record. Prémiate con una cena en un buen restaurante. ¡Te lo mereces!");
        }
        break;
      case 10:
        if (dia < 23) {
          horoscopo = "libra";
           System.out.print(" Tienes una increíble creatividad, por lo que te resulta doloroso tener que pasarte el día rellenando formularios y removiendo pilas de papeles. Vaya, eso es lo que te espera en el día de hoy. Afortunadamente, además de tu lado creativo, también tienes una gran astucia comercial, lo que te permite acabar con las pilas de papeles en tiempo record. Prémiate con una cena en un buen restaurante. ¡Te lo mereces!");
        } else {
          horoscopo = "escorpio";
          System.out.print("En este momento, tu mayor concentración se encuentra ya sea en un grupo del cual eres afiliada, o en un tema intelectual en el cual tienes un intenso interés. ¡O quizás en ambos! Las artes, en especial escribir y dibujar, pueden estar entre estos temas. Varios de tus amigos pueden compartir tus intereses, particularmente una mujer que vive cerca de ti, así que mantendrán interesantes discusiones durante los próximos días. ¡Diviértete! ");
        }
        break;
      case 11:
        if (dia < 23) {
          horoscopo = "escorpio";
         System.out.print("En este momento, tu mayor concentración se encuentra ya sea en un grupo del cual eres afiliada, o en un tema intelectual en el cual tienes un intenso interés. ¡O quizás en ambos! Las artes, en especial escribir y dibujar, pueden estar entre estos temas. Varios de tus amigos pueden compartir tus intereses, particularmente una mujer que vive cerca de ti, así que mantendrán interesantes discusiones durante los próximos días. ¡Diviértete! ");

        } else {
          horoscopo = "sagitario";
          System.out.print("Hoy podría asaltarte la timidez. Desearías esconderte a hibernar en soledad. Si debes asistir a encuentros sociales, podría faltarte la energía. No te exijas demasiado. Si \"sobreactúas\" te estresarás aún más. Adopta un estilo informal y relajado y charla tranquilamente con la gente. Si evitas los temas complicados, conservarás tu energía.");
        }
        break;
      case 12:
        if (dia < 21) {
          horoscopo = "sagitario";
          System.out.print("Hoy podría asaltarte la timidez. Desearías esconderte a hibernar en soledad. Si debes asistir a encuentros sociales, podría faltarte la energía. No te exijas demasiado. Si \"sobreactúas\" te estresarás aún más. Adopta un estilo informal y relajado y charla tranquilamente con la gente. Si evitas los temas complicados, conservarás tu energía.");

        } else {
          horoscopo = "capricornio";
          System.out.print("Debido a circunstancias fuera de tu control, una tarea a la que has dedicado bastante tiempo podría quedar paralizada hoy. Tu frustración será considerable, ya que no puedes hacer nada para agilizar la situación. No te preocupes demasiado, las cosas volverán a su normalidad. Lo mejor que puedes hacer es trabajar en algo más hasta que el impasse se resuelva. ");
        }
        break;
      default:
    }

    System.out.print("  "+horoscopo);  
}
}