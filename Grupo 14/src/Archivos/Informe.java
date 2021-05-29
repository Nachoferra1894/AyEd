package Archivos;

import java.io.*;
import java.util.Scanner;

public class Informe {
    private Scanner lector;
    private String nombreArchivo = "RegistroVentas.txt";

    public Informe() {
        lector = new Scanner(System.in);
        int opcion = menu();
        while (opcion < 4) {
            switch (opcion) {
                case 1 -> generarArchivoVentas();
                case 2 -> montoPorDestino();
                case 3 -> montoPorMes();
            }
            opcion = menu();
        }
    }

    public int menu(){
        System.out.println("1. Generar Archivo de ventas");
        System.out.println("2. Monto de las ventas en pesos discriminadas por destino");
        System.out.println("3. Monto de las ventas en pesos discriminadas por mes");
        String opc = lector.nextLine();
        return Integer.parseInt(opc);
    }

    public void montoPorDestino(){
        try{
            //RandomAccessFile raf = new RandomAccessFile("RegistroDestino.txt", "r");
            //RandomAccessFile raf2 = new RandomAccessFile("RegistroCotizacion.txt", "r");
            ArchivoVentas archV = new ArchivoVentas(nombreArchivo);
            archV.inicio();
            BufferedReader bf = new BufferedReader(new FileReader("RegistroDestino"));
            BufferedReader bf2 = new BufferedReader(new FileReader("RegistroCotizacion"));
            MontoDestino[] montoDestinos = new MontoDestino[30];
            CotizacionDolar[] cotizacionesPorMes = new CotizacionDolar[12];

            for (int i = 0; i < 30; i++) {
                String[] parts = splitDestino(bf.readLine());
                montoDestinos[i] = new MontoDestino(parts[0], parts[1]);
            }

            for (int i = 0; i < 12; i++) {
                int[] parts = splitCotizacion(bf2.readLine());
                cotizacionesPorMes[i] = new CotizacionDolar(parts[0], parts[1]);
            }

            for (int i = 0; i < archV.cantReg(); i++) {

                Venta venta = archV.leer();
                for (MontoDestino montoDestino : montoDestinos) {
                    if (venta.getCodigoDeDestino().equals(montoDestino.getCodigoDeDestino())) {
                        montoDestino.setMontoDestino(venta.getCantidad() * venta.getPrecioUnitarioEnDolares() * cotizacionesPorMes[venta.getMes()].getCotizacion());
                    }
                }
            }

            for (MontoDestino montoDestino : montoDestinos) {
                System.out.println(montoDestino.toString());
            }
            archV.cerrar();
            bf.close();
            bf2.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void montoPorMes(){
        try {
            ArchivoVentas archV = new ArchivoVentas(nombreArchivo);
            archV.inicio();
            //RandomAccessFile raf = new RandomAccessFile("RegistroCotizacion.txt", "rw");
            BufferedReader bf = new BufferedReader(new FileReader("RegistroCotizacion"));

            CotizacionDolar[] cotizacionesPorMes = new CotizacionDolar[12];
            for (int i = 0; i < 12; i++) {
                int[] parts = splitCotizacion(bf.readLine());
                cotizacionesPorMes[i] = new CotizacionDolar(parts[0], parts[1]);
            }

            int[] montoPorMes = new int[12];
            for (int i = 0; i < archV.cantReg(); i++) {
                Venta venta = archV.leer();
                for (int j = 0; j < montoPorMes.length; j++) {
                    if (venta.getMes() == (j+1)){
                        montoPorMes[j] += venta.getCantidad()*venta.getPrecioUnitarioEnDolares()*cotizacionesPorMes[venta.getMes()].getCotizacion();
                    }
                }
            }

            for (int i = 0; i < montoPorMes.length ; i++) {
                System.out.println("\nMes: " + (i+1) + "\n" +
                        "Monto Total: " + montoPorMes[i]);
            }

            archV.cerrar();
            bf.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void generarArchivoVentas(){
        try{
            ArchivoVentas archV = new ArchivoVentas(nombreArchivo);

            String[] destinos = new String[30];
            //RandomAccessFile raf = new RandomAccessFile("RegistroDestino.txt", "rw");
            BufferedReader bf = new BufferedReader(new FileReader("RegistroDestino"));
            File file;
            //BufferedWriter bw = new BufferedWriter(new FileWriter("RegistroDestino"));

            String line;
                for (int i = 0; i < destinos.length-1; i++) {
                    line = bf.readLine();
                    if (line != null) {
                        destinos[i] = splitLn(line);
                    }
                }

            for (int i = 0; i < 350; i++) { // Creamos una venta random y la escribimos en el archivo
                archV.fin();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("RegistroVentas.txt",true));
                //No pudimos usar el raf.writeUTF porque lo escribia en caracteres raros

                Venta ventaRandom = new Venta(destinos[(int) Math.floor(Math.random()*(destinos.length-1))], i,
                        (int) Math.floor(Math.random()*(10-1+1)+1), (int) Math.floor(Math.random()*(50-10+1)+10),
                        (int) Math.floor(Math.random()*(30-1+1)+1), (int) Math.floor(Math.random()*(12-1+1)+1),
                        2021);

                //archV.escribir(ventaRandom);
                bufferedWriter.write(ventaRandom.toString()); // Escribimos y hacemos un salto de linea
                bufferedWriter.newLine();
                bufferedWriter.close();

            }
            bf.close();
            archV.cerrar();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Informe generado Exitosamente");
    }


    private String splitLn(String line){

        String[] parts = line.split(";");
        return parts[0];
    }

    private String[] splitDestino(String line){
        return line.split(";");
    }

    private int[] splitCotizacion(String line){
        int[] parts = new int[2];
        String[] parts2 = line.split(";");
        parts[0] = Integer.parseInt(parts2[0]); //Separamos el mes del costo
        parts[1] = Integer.parseInt(parts2[1]);
        return parts;
    }

}
