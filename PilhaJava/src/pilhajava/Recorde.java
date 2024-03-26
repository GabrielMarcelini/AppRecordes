/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhajava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gabriel
 */
public class Recorde {
    private String nome;
    private double tempo;
    private LocalDate data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString(){
        String dataFormatada = this.data.format
                (DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return "[Nome:"+this.nome+"data:"+ dataFormatada + "tempo:"+this.tempo+"]";
    }
    
}
