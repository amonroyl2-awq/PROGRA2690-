/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author umg
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PagoTarjeta pg1 = new PagoTarjeta (200,12/12/2025 );
        System.out.println(pg1.getMonto());
    }
    
}
//crear una herencia simple donde la clase padre sea documentoy las clases hijas sean memo, carta ,informe documento que tiene un metodo 
//que tiene imprimir y uno que se llama escribir carta hereda documentopero tiene fecha y destinatario, memo hereda el documento pero
//tiene numero de paginas, informe hereda el documento pero tiene cartas y un documento tampoco 