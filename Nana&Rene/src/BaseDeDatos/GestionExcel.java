/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;
import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import logica.*;
        
/**
 *
 * @author Javiera Méndez
 */
public class GestionExcel
{
    Workbook wb;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<MateriaPrima> materiasPrimas;
    
    public GestionExcel()
    {
        this.productos = new ArrayList<Producto>();
        this.pedidos = new ArrayList<Pedido>();
        this.materiasPrimas = new ArrayList<MateriaPrima>();
    }
    
    public ArrayList<Producto> importarProductos(File archivo)
    {
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = 0;
            while(filaIterator.hasNext())
            {
                if(indiceFila == 0 )
                {
                    filaIterator.next();
                }
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
   
                String nombre = "";
                int tiempoElaboracion = 0, precioVenta = 0;
                HashMap<MateriaPrima,Integer> materiasPrimas = new HashMap<>(); 
                int indiceColumna = 0;
                while(columnaIterator.hasNext())
                {
                    Cell celda = (Cell) columnaIterator.next();
                    switch (indiceColumna) {
                        case 0:
                            nombre = celda.getStringCellValue();
                            break;
                        case 1:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    tiempoElaboracion = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        case 2:
                            String listado = celda.getStringCellValue();
                            String[] mp = listado.split(",");
                            for(int i = 0; i < mp.length; i++)
                            {
                                MateriaPrima objMP = new MateriaPrima(mp[i], 0.0, " ");
                                materiasPrimas.put(objMP, 0);
                            }   break;
                        case 3:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    precioVenta = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        default:
                            break;
                    }
                    indiceColumna++;
                }
                Producto p = new Producto(nombre, precioVenta, tiempoElaboracion, materiasPrimas);
                productos.add(p);
                indiceFila++;
            }
        } catch (Exception e){
        }
        return productos;
    }
    
    public ArrayList<Pedido> importarPedidos(File archivo)
    {
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = 0;
            while(filaIterator.hasNext())
            {
                if(indiceFila == 0 )
                {
                    filaIterator.next();
                }
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();

                String tipoProducto = "";
                int cantidad = 0;
                Date fechaSolicitud = null;
                Date fechaRetiro = null;
                String nombreCliente = "", correoCliente = "", numeroCliente = "";
                int precioAbonado = 0, descuento = 0;

                int indiceColumna = 0;
                while(columnaIterator.hasNext())
                {
                    Cell celda = (Cell) columnaIterator.next();
                    
                    switch (indiceColumna) {
                        case 0:
                            tipoProducto = celda.getStringCellValue();
                            break;
                        case 1:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    cantidad = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        case 2:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    if (DateUtil.isCellDateFormatted(celda))
                                    {
                                        fechaSolicitud = celda.getDateCellValue();
                                    }
                            }   break;
                        case 3:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    if (DateUtil.isCellDateFormatted(celda))
                                    {
                                        fechaRetiro = celda.getDateCellValue();
                                    }
                            }   break;
                        case 4:
                            nombreCliente = celda.getStringCellValue();
                            break;
                        case 5:
                            correoCliente = celda.getStringCellValue();
                            break;
                        case 6:
                            numeroCliente = celda.getStringCellValue();
                            break;
                        case 8:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    precioAbonado = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        case 9:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    descuento = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        default:
                            break;
                    }
                    indiceColumna++;
                }
                Pedido p = new Pedido(tipoProducto, cantidad, fechaSolicitud, fechaRetiro, descuento, nombreCliente, correoCliente, numeroCliente, precioAbonado);
                pedidos.add(p);
                indiceFila++;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return pedidos;
    }
    
    public ArrayList<MateriaPrima> importarMateriasPrimas(File archivo)
    {
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = 0;
            while(filaIterator.hasNext())
            {
                if(indiceFila == 0 )
                {
                    filaIterator.next();
                }
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
   
                String nombre = "";
                double cantidad = 0.0;
                String unidad = "";
                int indiceColumna = 0;
                while(columnaIterator.hasNext())
                {
                    Cell celda = (Cell) columnaIterator.next();
                    switch (indiceColumna) {
                        case 0:
                            nombre = celda.getStringCellValue();
                            break;
                        case 1:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    cantidad = celda.getNumericCellValue();
                                    break;
                            }   break;
                        case 2:
                            String listado = celda.getStringCellValue();
                            String[] mp = listado.split(",");
                            for(int i = 0; i < mp.length; i++)
                            {
                                unidad = celda.getStringCellValue();
                            }   break;
                        default:
                            break;
                    }
                    indiceColumna++;
                }
                MateriaPrima mp = new MateriaPrima(nombre, cantidad, unidad);
                materiasPrimas.add(mp);
                indiceFila++;
            }
        } catch (Exception e){
        }
        return materiasPrimas;
    }
    
    public String exportarProductos(File archivo){
        String respuesta = "No se realizo con éxito la exportación";
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        try{
            for(int i = -1; i < productos.size(); i++)
            {
                Row fila = hoja.createRow(i+1);
                Cell nombre = fila.createCell(0);
                Cell tiempo = fila.createCell(1);
                Cell materias = fila.createCell(2);
                Cell precio = fila.createCell(3);
                if(i == -1)
                {
                    nombre.setCellValue("Nombre");
                    tiempo.setCellValue("Tiempo requerido");
                    materias.setCellValue("Materias primas");
                    precio.setCellValue("Precio de venta");
                }
                else
                {
                    nombre.setCellValue(productos.get(i).getNombre());
                    tiempo.setCellValue(productos.get(i).getTiempoElaboracion());
                    HashMap<MateriaPrima, Integer> mp = productos.get(i).getMateriasPrimas();
                    String listado = "";
                    for(MateriaPrima m: mp.keySet())
                    {
                        listado += m.getNombre()+",";
                    }
                    materias.setCellValue(listado);
                    precio.setCellValue(productos.get(i).getPrecioVenta());
                }
                wb.write(new FileOutputStream(archivo));
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
    
    public String exportarPedido(File archivo){
        String respuesta = "No se realizo con éxito la exportación";
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        try{
            for(int i = -1; i < pedidos.size(); i++)
            {
                Row fila = hoja.createRow(i+1);
                Cell tipo = fila.createCell(0);
                Cell cantidad = fila.createCell(1);
                Cell fechaSolicitud = fila.createCell(2);
                Cell fechaRetiro = fila.createCell(3);
                Cell nombre = fila.createCell(4);
                Cell correo = fila.createCell(5);
                Cell numero = fila.createCell(6);
                Cell estado = fila.createCell(7);
                Cell precio = fila.createCell(8);
                Cell descuento = fila.createCell(9);
                if(i == -1)
                {
                    tipo.setCellValue("Tipo de producto");
                    cantidad.setCellValue("Cantidad");
                    fechaSolicitud.setCellValue("Fecha de solicitud");
                    fechaRetiro.setCellValue("Fecha de retiro estimado");
                    nombre.setCellValue("Nombre");
                    correo.setCellValue("Correo electrónico");
                    numero.setCellValue("Número telefónico");
                    estado.setCellValue("Estado");
                    precio.setCellValue("Precio cancelado");
                    descuento.setCellValue("Porcentaje descuento");
                }
                else
                {
                    tipo.setCellValue(pedidos.get(i).getTipoProducto());
                    cantidad.setCellValue(pedidos.get(i).getCantidad());
                    //PROBLEMAS AL PARSEAR FECHAA NI CON SIMPLEDATEFORMAT SIRVE
                    fechaSolicitud.setCellValue((Date) pedidos.get(i).getFechaSolicitud());
                    fechaRetiro.setCellValue((Date) pedidos.get(i).getFechaRetiro());
                    nombre.setCellValue(pedidos.get(i).getNombreCliente());
                    correo.setCellValue(pedidos.get(i).getCorreoCliente());
                    numero.setCellValue(pedidos.get(i).getNumeroCliente());
                    estado.setCellValue(pedidos.get(i).getEstado());
                    precio.setCellValue(pedidos.get(i).getPrecioAbonado());
                    descuento.setCellValue(pedidos.get(i).getDescuento());
                }
                wb.write(new FileOutputStream(archivo));
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
    
    public String exportarMateriasPrimas(File archivo){
        String respuesta = "No se realizo con éxito la exportación";
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        try{
            for(int i = -1; i < materiasPrimas.size(); i++)
            {
                Row fila = hoja.createRow(i+1);
                Cell nombre = fila.createCell(0);
                Cell cantidad = fila.createCell(1);
                Cell unidad = fila.createCell(2);

                if(i == -1)
                {
                    nombre.setCellValue("Nombre");
                    cantidad.setCellValue("Cantidad");
                    unidad.setCellValue("Unidad de medida");
                }
                else
                {
                    nombre.setCellValue(materiasPrimas.get(i).getNombre());
                    cantidad.setCellValue(materiasPrimas.get(i).getCantidad());
                    unidad.setCellValue(materiasPrimas.get(i).getUnidad());
                }
                wb.write(new FileOutputStream(archivo));
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
}

/*
System.out.println(celda);
indiceColumna++;

if(indiceFila == 0){
    modeloT.addColumn(celda.getStringCellValue());
}
else{
    if(celda != null){
        switch(celda.getCellType()){
            case Cell.CELL_TYPE_NUMERIC:
                listaColumna[indiceColumna] = (int) Math.round(celda.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING:
                listaColumna[indiceColumna] = celda.getStringCellValue();
            case Cell.CELL_TYPE_BOOLEAN:
                listaColumna[indiceColumna] = celda.getBooleanCellValue();
                break;
            default:
                listaColumna[indiceColumna] = celda.getDateCellValue();
        }
    }
}
if(indiceFila != 0){
    modeloT.addRow(listaColumna);
}*/
