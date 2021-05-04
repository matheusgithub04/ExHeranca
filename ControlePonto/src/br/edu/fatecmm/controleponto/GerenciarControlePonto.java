package br.edu.fatecmm.controleponto;

import br.edu.fatecmm.controleponto.model.Gerente;
import br.edu.fatecmm.controleponto.model.Operador;
import br.edu.fatecmm.controleponto.model.RegistroPonto;
import br.edu.fatecmm.controleponto.model.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDateTime hora = LocalDateTime.now();

        Gerente g = new Gerente();
        g.setLogin("func1");
        g.setSenha("func123");
        g.setIdFunc(1);
        g.setNome("Keryal");
        g.setDocumento("12345612390");
        g.setEmail("keryal@gmail.com");

        Secretaria s = new Secretaria();
        s.setIdFunc(2);
        s.setNome("Matheus");
        s.setDocumento("12312312312");
        s.setEmail("matheus@gmail.com");
        s.setTelefone("123123123");
        s.setRamal("231");

        Operador o = new Operador();
        o.setIdFunc(3);
        o.setNome("Orvalisson");
        o.setDocumento("34212345612");
        o.setEmail("orvalisson@gmail.com");
        o.setValorHora(350.25);

        RegistroPonto rp = new RegistroPonto();
        rp.setFunc(g);
        rp.setIdRegPonto(1);
        rp.setDataRegistro(data);
        try{
            Thread.sleep (1000);
        }catch (InterruptedException ex) {}
        rp.setHoraEntrada(hora);
        rp.apresentarRegistroPonto();

        RegistroPonto rp1 = new RegistroPonto();
        rp1.setFunc(s);
        rp1.setIdRegPonto(2);
        rp1.setDataRegistro(data);
        try{
            Thread.sleep (1000);
        }catch (InterruptedException ex) {}
        rp1.setHoraEntrada(hora);
        rp1.apresentarRegistroPonto();

        RegistroPonto rp2 = new RegistroPonto();
        rp2.setFunc(o);
        rp2.setIdRegPonto(3);
        rp2.setDataRegistro(data);
        try{
            Thread.sleep (1000);
        }catch (InterruptedException ex) {}
        rp2.setHoraEntrada(hora);
        rp2.apresentarRegistroPonto();

        try{
            Thread.sleep (1000);
        }catch (InterruptedException ex) {}
        rp.setHoraSaida(hora);
        rp.apresentarRegistroPonto();

        try{
            Thread.sleep (1000);
        }catch (InterruptedException ex) {}
        rp1.setHoraSaida(hora);
        rp1.apresentarRegistroPonto();

        try{
            Thread.sleep (1000);
        }catch (InterruptedException ex) {}
        rp2.setHoraSaida(hora);
        rp2.apresentarRegistroPonto();
    }
}
