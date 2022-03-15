package bbdd;

import ficheros.UtilidadesFicheros;
import modelos.Personaje;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesBBDD {

    private static final String url = "jdbc:mariadb://localhost:3306/leagueOfLegends";
    private static final String username = "root";
    private static final String password = "1234";

    private static Connection conectarBBDD(){
        Connection conexion;

        try {
            conexion = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            System.out.println("Error al conectar con la BBDD" + e.toString());
            return null;
        }

        return conexion;
    }


    public static void insertarPersonajes(){
        Connection con = conectarBBDD();

        List<Personaje> p1 = new ArrayList<>();

        try {
            p1 = UtilidadesFicheros.leerFicheroPersonajes();
        }catch (Exception e){
            System.out.println("Error al leer los personajes");
        }

        for (Personaje e : p1){

            PreparedStatement stmt = con.prepareStatement("INSERT into personajes(id,nombre,Fecha,Danio_Base," +
                    "Defensa_Base,Vida_Base,Mana_Base,Region) values (e.getid(),)")

        }





    }
}
