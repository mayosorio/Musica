
package musica;

/**
 *
 * @author a
 */

public class Cancion {

    String titulo, artista;
    boolean fav, descarga;
    int segundos, minutos;

    public Cancion(String titulo, String artista, boolean fav, boolean descarga, int segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.fav = fav;
        this.descarga = descarga;
        this.segundos = segundos;
        this.minutos = minutos;
    }

    public void adelantarCancion(int segundos) {
        int segundosActuales = this.segundos;
        int minutosActuales = this.minutos;

        int segundosTotales = segundosActuales + segundos;
        int minutosTotales = (segundosTotales / 60) + minutosActuales;

        int nuevosSegundos = segundosTotales % 60;

        this.minutos = minutosTotales;
        this.segundos = nuevosSegundos;
    }

    public String mostrarDetalles() {
        String info;
        String duracion;
        
       
        if (this.minutos <= 9) {
            duracion = "0" + this.minutos;
        } else {
            duracion = this.minutos + "";
        }

        if (this.segundos <= 9) {
            duracion = duracion + ":" + "0" + this.segundos;
        } else {
            duracion = duracion + ":" + this.segundos;
        }

        info = "Título: " + this.titulo + "\n";
        info = info + "Artista: " + this.artista + "\n";
        info = info + "Duración: " + duracion + "\n";
        info = info + "Favorita: " + this.fav + "\n";
        info = info + "Descargada: " + this.descarga + "\n";

        return info;
    }

    public String tipoDuracion() {
        if (this.minutos >= 5) {
            return "La canción es larga";
        } else {
            return "La canción es corta";
        }
    }
}
