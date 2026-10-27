/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.prg03diegojsaraujo;

import org.flywaydb.core.Flyway;

/**
 *
 * @author guest
 */
public class Prg03diegojsaraujo {

    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource(
                    "jdbc:postgresql://localhost:5432/bd_estoque",
                    "postgres",
                    "123456"
                )
                .load();

        flyway.migrate();
    }
}
